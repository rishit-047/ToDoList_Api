# ToDoList_Api
A secure and efficient **REST API** for a To-Do List application, built using **Spring Boot**, **JPA**, and **MySQL**. It supports task management with **CRUD operations**, **user authentication**, and **role-based access control** for enhanced security.

# Features
* **View all tasks** – Accessible to all users.
* **Create a new task** – Only editors can add tasks.
* **View a task by ID** – Accessible to all users.
* **Update an existing task** – Only editors can modify tasks.
* **Delete a task** – Only editors can remove tasks.
* **Security** – Bcrypt used for authentication.

# Requirements
- **Spring Boot 2.x or 3.x** – Framework for Java apps
- **JDK 17 or higher** – Java Development Kit
- **IntelliJ IDEA, Eclipse, or Visual Studio Code** – IDE for development
- **Maven** – Build and dependency management
- **PostgreSQL or MySQL** – Databases for storing data
- **Spring Web** – REST API support
- **Spring Security** – Authentication and authorization
- **Spring Data JPA** – Database access and management
- **Bcrypt** – Password hashing algorithm
- **JUnit or Postman** – Testing frameworks for Java

# Setup
<h2>1. Clone the repository</h2>
- Clone the repository and navigate into the respective project folder.
    
        https://github.com/rishit-047/ToDoList_Api.git 
        cd ToDoList_Api

## 2. Configure the database
- Create a new database in MySQL to store the to-do list data.
- Create the first table named `to_do_list` with the following parameters:
    - `id` (INT, Primary Key)
    - `start_date` (VARCHAR(50))
    - `end_date` (VARCHAR(50))
    - `progress` (VARCHAR(15))
- Create the second table named `members` for authorized users with the following parameters:
    - `user_id` (VARCHAR(50), Primary Key)
    - `pw` (CHAR(68))
    - `active` (TINYINT)
- Create the third table named `roles` for assigning user roles/authorities with the following parameters:
    - `user_id` (VARCHAR(100), Foreign Key referencing `members.user_id`)
    - `role` (VARCHAR(50))
- Update the database connection details in `src/main/resources/application.properties`
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```


## 3. Run the application
    
    mvn spring-boot:run

