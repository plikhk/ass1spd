## Project Description
This project demonstrates the implementation of the **Builder design pattern** in Java. 
The chosen domain is PC Assembly, where computers are built step-by-step using a Fluent API and validated configurations.

## Features
* **Abstract Builder:** Eliminates duplicated logic between concrete builders.
* **Director Class:** Manages predefined build presets (e.g., Top-Tier Gaming Rig, Call Center Terminal).
* **Clean Code:** 
  * Strict object validation before creation.
  * `Enum` usage for cooling types to avoid magic strings.
  * Fluent API implementation (`return this`).

## How to Run
1. Clone the repository: `git clone https://github.com/plikhk/ass1spd.git`
2. Open the project in IntelliJ IDEA (Java 17+ recommended).
3. Run `Main.java` to see the client demonstration and error-handling in action.

**Author:** Alikhan Kadashov
