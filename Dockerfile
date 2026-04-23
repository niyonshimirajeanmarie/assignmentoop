# Use OpenJDK 17 as the base image
FROM eclipse-temurin:17-jdk

# Metadata
LABEL maintainer="Niyonshimira Jeanmarie"
LABEL student_id="27197"
LABEL group="D"

# Set the working directory inside the container
WORKDIR /app

# Copy the generated JAR file into the container
COPY airport-system.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
