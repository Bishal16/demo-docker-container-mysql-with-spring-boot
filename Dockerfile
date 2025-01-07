# Use an OpenJDK base image with Java 21
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar into the container
COPY target/Docker-container-1.0-SNAPSHOT.jar myapp.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "myapp.jar"]
