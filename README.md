# Day 20 — Distributed Configuration Management Platform

Java 17 + Spring Boot 3.3.5 project demonstrating centralized configuration, environment profiles, refreshable configuration, service discovery-style configuration consumption, Actuator, Docker Compose and GitHub Actions.

## Services
- Config Server: 8888
- Order Service: 8081
- Payment Service: 8082

## Run
```bash
docker compose up --build
```

Config Server: http://localhost:8888
Order: http://localhost:8081/api/orders/demo
Payment: http://localhost:8082/api/payments/demo

## Concepts
- Spring Cloud Config Server
- Centralized configuration
- `dev` profile
- Config import from clients
- Actuator health/info
- Externalized configuration
- Docker Compose
- CI workflow

## GitHub
```bash
git init
git add .
git commit -m "Day 20 distributed config platform"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/distributed-config-platform-day20.git
git push -u origin main
```
