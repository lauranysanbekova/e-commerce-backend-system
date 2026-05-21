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

## Technologies Used

Backend:

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

Security:

- Spring Security
- JWT Authentication

Database:

- PostgreSQL

Documentation:

- Swagger OpenAPI

Containerization:

- Docker
- Docker Compose

Build Tool:

- Maven

Additional:

- Lombok
- CompletableFuture
- Async Processing

---

## Project Structure

```text
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── mapper
 ├── security
 ├── auth
 ├── exception
 ├── logging
 ├── config
 └── async
```

---

## Database Entities

The system includes:

1. LauraNysanbekUser
2. LauraNysanbekProduct
3. LauraNysanbekCategory
4. LauraNysanbekOrder
5. LauraNysanbekOrderItem

---

## REST API Endpoints

### Authentication

Register:

```http
POST /api/auth/register
```

Login:

```http
POST /api/auth/login
```

---

### Products

Get products:

```http
GET /api/products
```

Get product by id:

```http
GET /api/products/{id}
```

Create product:

```http
POST /api/products
```

Update product:

```http
PUT /api/products/{id}
```

Delete product:

```http
DELETE /api/products/{id}
```

---

## JWT Authentication

Protected endpoints require JWT token.

Header example:

```text
Authorization: Bearer your_jwt_token
```

---

## Validation

Validation annotations used:

- @Valid
- @NotBlank
- @Email
- @NotNull

---

## Exception Handling

Global exception handling implemented using:

```text
GlobalExceptionHandler
```

---

## DTO and Mapping

Implemented:

- DTO classes
- Entity to DTO mapping
- Mapper classes

Example:

```text
LauraNysanbekProductMapper
```

---

## Async Processing

Implemented asynchronous operations using:

- @Async
- CompletableFuture

---

## Logging

Logging implemented for:

- Incoming requests
- Important actions
- Application events

Example:

```text
LauraNysanbekLoggingFilter
```

---

## File Upload & Download

Supports:

- Upload files
- Download files

---

## API Documentation

Swagger UI:

```text
http://localhost:8081/swagger-ui/index.html
```

---

## Docker Support

Implemented:

- Dockerfile
- docker-compose.yml
- Multistage Build
- Health Check
- Containerized PostgreSQL

Run:

```bash
docker compose up --build
```

---

## Run Application Locally

```bash
mvn spring-boot:run
```

---

## Future Improvements

- Payment Integration
- Admin Dashboard
- Email Notifications
- Product Images
- Order Tracking

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
