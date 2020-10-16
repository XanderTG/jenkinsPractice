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

    }
} 
