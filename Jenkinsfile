pipeline {
    environment {
        registry = "xandertg/calculator"
        registryCredential = 'dockerhub'
        dockerImage=''
    }

    agent any
    
    stages {
        stage ('build') {
            steps {
                sh 'echo Compile'
                
            }
        }
        
        stage ('test') {
            steps {
                sh 'echo Test'
            }
        }
        
        stage ('deploy') {
            steps {
                sh 'echo Deploy'
            }
        }
        
        stage ('Package') {
            steps {
                sh 'mvn package'
                archiveArtifacts artifacts: 'src/**/*.java'
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage ('Building image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        
        stage ('Deploy Image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        
        stage ('Remove unused docker image') {
            steps {
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }

    }
    
    post {
	    failure{
       	  mail to: 'ajsteim6@gmail.com',
	      subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
	      body: "Something is wrong with ${env.BUILD_URL}"
	    }
}

} 
