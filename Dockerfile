FROM openjdk:8-jdk-alpine

WORKDIR /app/api

COPY ./target/*.jar boot-api.jar

CMD ["java", "-jar", "boot-api.jar"]

