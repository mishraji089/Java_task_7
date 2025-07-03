# 🧾 Employee Database App – Spring Boot + PostgreSQL

A simple CRUD (Create, Read, Update, Delete) web application built with **Spring Boot** and **PostgreSQL** using **Spring Data JPA**. This app allows you to manage employee records through RESTful APIs.

---

## 🚀 Features

- Add new employees
- View all employees
- Update existing employee details
- Delete employees
- PostgreSQL integration using Spring Data JPA
- RESTful APIs using Spring Web

---

## 🧱 Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: PostgreSQL
- **ORM**: Spring Data JPA (Hibernate)
- **Build Tool**: Maven

---

## 🗄️ Database Schema

SQL for creating the `employees` table:

```sql
CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(50),
    salary DOUBLE PRECISION
);
```
```bash
git clone https://github.com/yourusername/employee-database-app.git
cd employee-database-app
```

```sql
CREATE DATABASE employee_db;
CREATE USER your_user WITH ENCRYPTED PASSWORD 'your_password';
GRANT ALL PRIVILEGES ON DATABASE employee_db TO your_user;
```
## Applications.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```bash
./mvnw spring-boot:run
```

## ✅ Sample Project Structure

src
├── main
│   ├── java/com/example/employeedb
│   │   ├── EmployeeDbApplication.java
│   │   ├── controller/EmployeeController.java
│   │   ├── model/Employee.java
│   │   └── repository/EmployeeRepository.java
│   └── resources
│       └── application.properties

