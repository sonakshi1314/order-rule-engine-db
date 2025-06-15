```mermaid
flowchart LR
UI[User/API Client]
CONTROLLER[OrderController<br/>Receives requests]
SERVICE[OrderService<br/>Main business logic]
ENGINE[RuleEngine<br/>Evaluates rules]
REPO[RuleRepository<br/>Access H2 DB]
DB[(H2 In-Memory DB)]

    UI --> CONTROLLER
    CONTROLLER --> SERVICE
    SERVICE --> ENGINE
    SERVICE --> REPO
    REPO --> DB
