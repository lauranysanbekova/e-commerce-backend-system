# E-Commerce Backend System

## Description
This project is a Spring Boot backend application for an e-commerce system.

The application provides authentication, authorization, CRUD operations, file upload/download, asynchronous processing, filtering, pagination, and Docker support.

---

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

## Features

### Authentication & Security
- User Registration
- User Login
- JWT Token Authentication
- Protected Endpoints
- Authorization using Spring Security

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

Laura Nysanbekova