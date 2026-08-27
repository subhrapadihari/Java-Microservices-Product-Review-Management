# Java Microservices - Product Review Management

## 📌 Project Overview

This project is a Spring Boot Microservices application developed to demonstrate communication and service management using Spring Cloud.

The project contains multiple independent microservices that work together using service discovery, centralized configuration, and OpenFeign.

## 🏗️ Microservices

### 1. MS_5_Config_Server

Centralized configuration server for managing application configuration.

**Technologies:**
- Java
- Spring Boot
- Spring Cloud Config Server

### 2. MS_7_Admin_Server

Admin and monitoring service used for monitoring the microservices environment.

**Technologies:**
- Java
- Spring Boot
- Spring Boot Admin

### 3. MS_10_Eureka_Server

Service registry that allows microservices to register themselves and discover other services.

**Technologies:**
- Java
- Spring Boot
- Netflix Eureka Server
- Spring Cloud

### 4. MS_10_Review_Service

Main Review Service responsible for managing product review data.

**Technologies:**
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- REST API

### 5. MS_10_Review_Service_Client

Client service that communicates with the Review Service using OpenFeign.

**Technologies:**
- Java
- Spring Boot
- Spring Cloud OpenFeign
- Eureka Discovery Client
- REST API

## 🔄 Microservices Architecture

```text
                    ┌─────────────────────┐
                    │    Config Server    │
                    │    Port: 8888       │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │    Eureka Server    │
                    │   Service Registry  │
                    └──────────┬──────────┘
                               │
              ┌────────────────┼────────────────┐
              │                │                │
              ▼                ▼                ▼
      ┌──────────────┐ ┌──────────────┐ ┌──────────────┐
      │ Review       │ │ Review       │ │ Admin        │
      │ Service      │ │ Client       │ │ Server       │
      └──────┬───────┘ └──────┬───────┘ └──────────────┘
             │                │
             │◄── OpenFeign ──┘
             │
             ▼
          ┌─────────┐
          │  MySQL  │
          └─────────┘
🛠️ Technologies Used
Java
Spring Boot
Spring Cloud
Spring Cloud Config
Netflix Eureka
Spring Cloud OpenFeign
Spring Boot Admin
Spring Web
REST API
Spring Data JPA
Hibernate
MySQL
Maven
Git
GitHub
✨ Key Features
Microservices-based architecture
Service discovery using Eureka Server
Centralized configuration using Config Server
Inter-service communication using OpenFeign
RESTful APIs
Database integration using Spring Data JPA
Independent Spring Boot services
Maven-based project structure
Service monitoring using Spring Boot Admin
📂 Project Structure
Java-Microservices-Product-Review-Management
│
├── MS_5_Config_Server
│
├── MS_7_Admin_Server
│
├── MS_10_Eureka_Server
│
├── MS_10_Review_Service
│
└── MS_10_Review_Service_Client
▶️ How to Run

Start the services in the following order:

Config Server
Eureka Server
Review Service
Review Service Client
Admin Server

Make sure the required configuration and database settings are correctly configured before starting the services.

🔗 Service Communication

The Review Service registers with Eureka Server.

The Review Service Client discovers the Review Service through Eureka and communicates with it using OpenFeign.

Review Client
      │
      │ OpenFeign
      ▼
Eureka Server
      │
      │ Service Discovery
      ▼
Review Service
      │
      ▼
   MySQL
📚 Learning Outcomes

This project demonstrates practical knowledge of:

Microservices Architecture
Spring Boot
Spring Cloud
Service Discovery
Eureka Server
Config Server
OpenFeign
REST APIs
Spring Data JPA
MySQL
Maven
Git and GitHub
👩‍💻 Author

Subhra Padihari

Java | Spring Boot | Microservices | SQL


