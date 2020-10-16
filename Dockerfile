from openjdk
COPY ./src/main/java/*.java /
RUN javac /main.java /Calculator.java
ENTRYPOINT ["java", "main"]

