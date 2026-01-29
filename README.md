**Spring Boot Microservices E-Commerce Backend**

1. Project Overview
This project is a microservices-based e-commerce backend system developed using Spring Boot and Spring Cloud.
It demonstrates real-world backend design concepts such as service discovery, API gateway routing, synchronous and asynchronous communication, and fault tolerance.
Each service is developed independently to ensure scalability, resilience, and loose coupling.

2. Microservices Architecture.

The application consists of the following services:

Eureka Server for service registration and discovery

API Gateway as a centralized entry point for client requests

Order Service for handling order creation and publishing order events

Payment Service for consuming order events and processing payments

Inventory Service for managing product stock

Notification Service for handling notifications (logical implementation)

3. Communication Patterns.
3.1 Synchronous Communication.

Synchronous service-to-service communication is implemented using OpenFeign.

The Order Service communicates with the Inventory Service using REST APIs.

Resilience4j Circuit Breaker is applied to handle service failures gracefully.

A fallback response is returned when the dependent service is unavailable.

3.2 Asynchronous Communication.

Asynchronous communication is implemented using Apache Kafka.

The Order Service publishes order-related events to Kafka topics.

The Payment Service consumes these events asynchronously.

This approach enables loose coupling, fault isolation, and better scalability.

4. Fault Tolerance and Resilience.

Eureka Service Discovery enables dynamic service registration and lookup.

Resilience4j circuit breaker and fallback mechanisms prevent cascading failures during synchronous calls.

Kafka ensures event persistence so that messages are not lost even if consumer services are temporarily unavailable.

5. Technologies Used.

Java 17
Spring Boot
Spring Cloud (Eureka Server, API Gateway, OpenFeign)
Apache Kafka
Resilience4j
Maven

9. Author.

Developed as a learning project to understand real-world microservices architecture and distributed system design.
