```mermaid
graph TD
    User["User / Client App"] -->|HTTP POST /orders| API["OrderController"]
    API --> Service["OrderService"]
    Service --> RuleRepo["RuleRepository (H2 DB)"]
    Service --> Engine["RuleEngine"]
    RuleRepo -->|rules| Service
    Service -->|order + rules| Engine
    Engine -->|Evaluated Partner| Service
    Service --> API

