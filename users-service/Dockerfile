FROM maven:3.6.3-jdk-11 as builder
WORKDIR /opt/app
COPY pom.xml /opt/app/pom.xml
RUN mvn clean install
FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/users-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
COPY wait-for-it.sh .
ENTRYPOINT ["./wait-for-it.sh", "-t", "30", "--", "java", "-jar", "app.jar"]
EXPOSE 8087
