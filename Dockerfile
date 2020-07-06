FROM openjdk:8-jdk-alpine
copy ./target/Greeting-Service-1.0.jar Greeting-Service-1.0.jar
CMD ["java","-jar","Greeting-Service-1.0.jar"]