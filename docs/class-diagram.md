```mermaid
classDiagram
class Order {
String orderId
String orderType
String deliveryType
String country
}

    class Rule {
        Long id
        String name
        String condition
        String courierPartner
    }

    class OrderController {
        +route(Order): ResponseEntity
    }

    class OrderService {
        +processOrder(Order): String
    }

    class RuleEngine {
        +evaluate(Order, List~Rule~): Optional~String~
    }

    class RuleRepository

    OrderController --> OrderService
    OrderService --> RuleRepository
    OrderService --> RuleEngine
