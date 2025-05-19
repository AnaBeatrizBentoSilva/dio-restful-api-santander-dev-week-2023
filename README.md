# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    +String name
  }

  class Account {
    +String accountNumber
    +String agency
    +Float balance
    +Float limit
  }

  class Feature {
    +String icon
    +String description
  }

  class Card {
    +String cardNumber
    +Float cardLimit
  }

  class News {
    +String icon
    +String description
  }

  User *--> Account
  User *--> Card
  User *--> "0..*" Feature
  User *--> "0..*" News
```
