# REST API with Spring Boot and JPA

A simple **CloudVendor** CRUD service.

- **Stack:** Java 17, Spring Boot 2.7.x, Spring Web, Spring Data JPA, springdoc-openapi (Swagger UI)
- **Database:** Default *H2 (in-memory)*; optional *MySQL*
- **Goal:** Straightforward endpoints to create/read/update/delete vendors

# Prerequisites
- Java 17

# Getting Started (H2 – default)

`src/main/resources/application.properties`

spring.application.name=rest-demo
spring.mvc.pathmatch.matching-strategy=ant_path_matcher

spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:dcbapp
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=doa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

