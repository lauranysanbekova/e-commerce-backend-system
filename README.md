# E-Commerce Backend System

## Project Description

E-Commerce Backend System is a Spring Boot based REST API application developed for managing an online store platform.

This project provides complete backend functionality including authentication and authorization, CRUD operations, JWT security, file upload/download, asynchronous processing, filtering, pagination, logging, Docker support and API documentation.

The project follows a layered architecture:

- Controller Layer
- Service Layer
- Repository Layer

## Technologies

- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- PostgreSQL
- Hibernate JPA
- Docker
- Swagger OpenAPI
- Lombok
- Maven

---

## Main Features

### Authentication & Authorization

- User Registration
- User Login
- JWT Token Generation
- Protected Endpoints
- Spring Security Integration
- Authorization using Bearer Token

---

### User Management

- Create User
- Update User
- Delete User
- View User Information

---

### Product Management

- Create Product
- Update Product
- Delete Product
- View Products

---

### Category Management

- Create Categories
- Assign Products to Categories

---

### Order Management

- Create Orders
- Manage Order Items

---

### Search Features

Supports:

- Pagination
- Sorting
- Filtering
- Search

Example:

```http
GET /api/products?page=0&size=5&sort=id
```

---






### CRUD Operations
- Users
- Products
- Categories
- Orders
- Order Items

### Additional Features
- Pagination
- Sorting
- Filtering
- Search
- DTO Mapping
- Validation
- Exception Handling
- File Upload & Download
- Async Processing using @Async and CompletableFuture
- Logging
- Swagger API Documentation

---

## API Endpoints

### Authentication

#### Register
POST `/api/auth/register`

#### Login
POST `/api/auth/login`

---

### Products

#### Get Products
GET `/api/products`

#### Create Product
POST `/api/products`

#### Update Product
PUT `/api/products/{id}`

#### Delete Product
DELETE `/api/products/{id}`

---

## JWT Authentication

Protected endpoints require JWT token.

Example header:

Authorization: Bearer your_jwt_token

---

## Run Application

### Run Locally

```bash
mvn spring-boot:run
```

### Run with Docker

```bash
docker compose up --build
```

---

## Swagger UI

http://localhost:8081/swagger-ui/index.html

---

## Database

PostgreSQL is used as the main database.

---

## Docker Support

The project includes:

- Dockerfile
- docker-compose.yml
- Multistage Build
- Health Check
- Containerized PostgreSQL

---

## Author

Laura  Nysanbekova
