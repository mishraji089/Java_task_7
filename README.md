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


## Screenshots


![Screenshot 2025-07-03 133705](https://github.com/user-attachments/assets/b05eaaae-22b8-4348-a38d-10c1742f4f26)
![Screenshot 2025-07-03 133557](https://github.com/user-attachments/assets/5453c702-d9a2-44ed-b80b-a4b49e567e53)
![Screenshot 2025-07-03 133542](https://github.com/user-attachments/assets/8f252cab-4677-4079-9209-b7e600c1f200)
![Screenshot 2025-07-03 133512](https://github.com/user-attachments/assets/edd82563-8aaa-46ed-bd7c-b6ae4415f660)
![Screenshot 2025-07-03 133717](https://github.com/user-attachments/assets/a6bcc646-3c48-4060-963f-22235c1c008e)
