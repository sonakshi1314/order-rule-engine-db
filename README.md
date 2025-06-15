## 📘 API Documentation (Swagger)

This project uses **Springdoc OpenAPI** for live Swagger documentation.

- Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

All REST endpoints are self-documented using OpenAPI annotations.

## 🗄️ Accessing the In-Memory H2 Database

This application uses an in-memory H2 database to simulate persistent storage for rules and orders without needing an external database setup.

### 🔑 Default H2 Console Configuration

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:ruleengine
- Username: sa
- Password: (leave blank)

Make sure you match the JDBC URL with the one configured in your application properties .

