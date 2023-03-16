FROM openjdk:17-jdk-slim
RUN mkdir /app
WORKDIR /app
COPY . target/plantshedv2-0.0.1-SNAPSHOT.jar

EXPOSE 8080
CMD ["java", "-jar", "plantshedv2-0.0.1-SNAPSHOT.jar"]