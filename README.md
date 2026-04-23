# OOP Assignment - Advanced Airport Management System

## Student Information
* **Name:** Niyonshimira Jeanmarie
* **Student ID:** 27197
* **Group:** D
* **Title:** OOP Assignment

---

## Project Description
This project is an **Advanced Airport Management System** developed as part of the Object-Oriented Programming (OOP) course assignment. The system provides a comprehensive solution for managing airport operations, including:
* **Passenger Management:** Registering and managing passenger details.
* **Flight Management:** Creating and updating different types of flights (Domestic, International, Cargo, etc.) using the Factory Pattern.
* **Booking & Reservation:** Handling the flow from reservation to ticket generation and boarding pass issuance.
* **System Administration:** Tracking statuses, processing payments, and generating summaries.

The project demonstrates core OOP principles such as encapsulation, inheritance, polymorphism, and abstraction, along with design patterns like the Factory Pattern.

---

## How to Build the Project

To generate the runnable JAR file, follow these steps:

1. **Compile the source code:**
   ```bash
   javac -d out -sourcepath src src/_27197/main/AirportSystem.java
   ```

2. **Create the JAR file:**
   ```bash
   jar cfm airport-system.jar manifest.txt -C out .
   ```

---

## How to Run the Application

### Using Java
Ensure you have Java 17 or higher installed. Run the following command in the project root:
```bash
java -jar airport-system.jar
```

### Using Docker
Ensure you have Docker installed and running.

1. **Build the Docker image:**
   ```bash
   docker build -t oop-assignment-27197 .
   ```

2. **Run the Docker container:**
   ```bash
   docker run -it oop-assignment-27197
   ```

---

## Project Structure
* `src/`: Contains the Java source files organized by packages.
* `out/`: Contains the compiled class files.
* `airport-system.jar`: The executable JAR file.
* `Dockerfile`: Configuration for containerizing the application.
* `manifest.txt`: Metadata for the JAR file.
* `README.md`: Project documentation.

---

## Author
**Niyonshimira Jeanmarie**  
Student ID: 27197  
Group: D
