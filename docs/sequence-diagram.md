```mermaid
sequenceDiagram
participant U as User
participant C as Controller
participant S as Service
participant R as RuleRepository (DB)
participant E as RuleEngine

    U->>C: POST /orders (Order JSON)
    C->>S: route(order)
    S->>R: findAll()
    R-->>S: List<Rule>
    S->>E: evaluate(order, rules)
    E-->>S: CourierPartner
    S-->>C: Assigned Partner
    C-->>U: HTTP 200 OK (Assigned Partner)
