🛒 E-Commerce Backend Using Spring Boot

A RESTful backend application for an E-Commerce system built using Spring Boot.
This project provides APIs for cart management, entity handling, service logic, repository access, and security configuration.

🚀 Features

🛍 Cart Management APIs

📦 Entity & DTO Architecture

🗄 Spring Data JPA Repositories

🔐 Spring Security Configuration

🌱 Seed Data Initialization

🧠 Service Layer Business Logic

📬 Postman Collection for API Testing

🏗 Project Structure
src/main/java/com/balacode/balacart
│
├── controller     # REST Controllers
├── dto            # Data Transfer Objects
├── entity         # JPA Entities
├── repository     # Spring Data Repositories
├── seed           # Initial Data Loader
├── services       # Business Logic Layer
├── spec           # Specifications / Config
│
├── BalacartApplication.java
└── SecurityConfig.java
🛠 Tech Stack

Java 17+

Spring Boot

Spring Data JPA

Spring Security

Maven

MySQL / H2

Postman (API Testing)

📦 Requirements

Make sure you have installed:

Java 17 or above

Maven

MySQL (if using external DB)

Postman

▶️ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/BalaK2005/E-Commerce_Backend_Using_Spring_Boot.git
2️⃣ Navigate to Project Folder
cd E-Commerce_Backend_Using_Spring_Boot
3️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
4️⃣ Run the Application
mvn spring-boot:run

Application runs at:

http://localhost:8080
📬 Postman Collection

You can test all APIs using the shared Postman collection:

🔗 Postman Collection URL:
https://bala41735-3529189.postman.co/workspace/WEB-API~c23d6fd8-7038-4dd9-8ecb-3fde6ce697e5/collection/49544692-2956656f-359b-4f3c-b83d-6aa2feda5d46?action=share&creator=49544692

How to Import:

1.Open Postman
2.Click Import
3.Select Link
4.Paste the URL
5.Click Import



This project is open-source and available under the MIT License.

If you want, I can also give you a more professional recruiter-level README with badges and screenshots 🚀
