FROM openjdk:8-jdk-alpine

WORKDIR /app/api/ee

COPY ./target/*.jar boot-api.jar

CMD ["java", "-jar", "boot-api.jar"]

