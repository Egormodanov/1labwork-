# 1labwork-
```mermaid
graph TD
    A([Начало]) --> B[/Ввести: a, b/]
    B --> C{a == 0}
    C -- Нет --> D{a > 0}
    D -- Нет --> E[/Вывод: "any x without 0"/]
    D -- Да --> H[/Вывод: y/]
    C -- Да --> I{b == 0}
    I -- Нет --> J[/Вывод: -x/]
    I -- Да --> K[/Вывод: "any x without 0"/]
    J --> Z
    K --> Z
    H --> Z
    E --> Z([Конец])

```
