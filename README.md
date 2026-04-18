# E-Commerce Backend — Spring Boot

A RESTful backend for an E-Commerce system with cart management, security, and full API coverage.

---

## Features

- Cart Management APIs
- Entity and DTO Architecture
- Spring Data JPA Repositories
- Spring Security Configuration
- Seed Data Initialization
- Service Layer Business Logic

---

## Tech Stack

| Layer       | Technology        |
|-------------|-------------------|
| Language    | Java 17+          |
| Framework   | Spring Boot       |
| Persistence | Spring Data JPA   |
| Security    | Spring Security   |
| Build Tool  | Maven             |
| Database    | MySQL / H2        |
| API Testing | Postman           |

---

## Getting Started

### Prerequisites

- Java 17 or above
- Maven
- MySQL (if not using H2)

### 1. Clone the Repository

```bash
git clone https://github.com/BalaK2005/E-Commerce_Backend_Using_Spring_Boot.git
cd E-Commerce_Backend_Using_Spring_Boot
```

### 2. Configure the Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

The app runs at: http://localhost:8080

---

## API Testing (Postman)

1. Open Postman and click **Import**
2. Select **Link** and paste the collection URL below
3. Click **Import** and start testing

Collection URL:
```
https://bala41735-3529189.postman.co/workspace/WEB-API~c23d6fd8-7038-4dd9-8ecb-3fde6ce697e5/collection/49544692-2956656f-359b-4f3c-b83d-6aa2feda5d46?action=share&creator=49544692
```
