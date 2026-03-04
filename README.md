````md
# ToDoList-backend

A RESTful API backend for a ToDo List application. This project is built using Spring Boot and provides complete Create, Read, Update, and Delete (CRUD) operations for managing tasks.

---

## 🛠 Tech Stack

- **Java:** 21  
- **Framework:** Spring Boot 3.3.5  
- **Database:** MySQL (Spring Data JPA / Hibernate)  
- **Build Tool:** Maven  
- **Utilities:** Lombok  

---

## 📋 Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed **Java 21** or later.  
- You have installed **Maven**.  
- You have a **MySQL** server running locally on port `3306`.  

---

## 🚀 Getting Started

### 1. Database Setup

First, log in to your MySQL server and create a new database named `todo_db`:

```sql
CREATE DATABASE todo_db;
````

> **Note:** The application is configured to update the database schema automatically on startup using `ddl-auto: update`.

---

### 2. Configuration

If your MySQL credentials differ from the defaults, update the
`src/main/resources/application.yaml` file:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/todo_db
    username: root  # Replace with your MySQL username
    password: root  # Replace with your MySQL password
```

---

### 3. Running the Application

Open a terminal, navigate to the root directory of the project, and run:

```bash
mvn spring-boot:run
```

Alternatively, if you don't have Maven installed globally, use the Maven Wrapper included in the project:

**Windows**

```bash
.\mvnw.cmd spring-boot:run
```

**macOS/Linux**

```bash
./mvnw spring-boot:run
```

The server will start on port **8080**.

---

## 📖 API Reference

Cross-Origin Resource Sharing (CORS) is enabled for all origins (`*`), making it easy to connect with frontend applications.

**Base URL:**

```
http://localhost:8080/api/todos
```

---

## 📦 Todo Object Model

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Learn Spring Boot for Fresher."
  "completed": false
}
```

---

## 🔌 Endpoints

| Method | Endpoint          | Description                        | Request Body (JSON)                                           |
| ------ | ----------------- | ---------------------------------- | ------------------------------------------------------------- |
| GET    | `/api/todos`      | Retrieves a list of all todos      | None                                                          |
| POST   | `/api/todos`      | Creates a new todo                 | `{ "title": "...","description": "...", "completed": false }` |
| PUT    | `/api/todos/{id}` | Updates an existing todo by its ID | `{ "title": "...","description": "...", "completed": true }`  |
| DELETE | `/api/todos/{id}` | Deletes a todo by its ID           | None                                                          |

> **Note:** Endpoint behavior is based on `TodoController.java`, and the schema is based on `Todo.java`.

```
```
