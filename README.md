# Tower Defense (BlueJ) - Java Project

## Project Description

Tower Defense is a small, object-oriented tower defense game implemented in Java using BlueJ. The project demonstrates key OOP principles through a clear class hierarchy: three tower types (Basic, Rapid, Sniper) defend against three enemy types (Grunt, Speedster, Tank). Towers and enemies are implemented with inheritance and polymorphism to keep the design extensible and maintainable.

Key gameplay elements:
- Place towers to defend a path of enemies.
- Towers have different firing rates, ranges, and damage profiles.
- Enemies have distinct behaviors and stats: `Grunt` is the baseline, `Speedster` is fast but fragile, and `Tank` is slow but durable.

## Technologies Used

- Java (SE)
- BlueJ (development and execution environment)
- Object-oriented programming with inheritance and polymorphism

Relevant source files:
- [Runner.java](Runner.java) — main entry point used to start the game
- [GamePanel.java](GamePanel.java) — game loop and rendering
- `Tower` subclasses: [BasicTower.java](BasicTower.java), [RapidTower.java](RapidTower.java), [SniperTower.java](SniperTower.java)
- `Enemy` subclasses: [Grunt.java](Grunt.java), [Speedster.java](Speedster.java), [Tank.java](Tank.java)

## How to Run

Prerequisites:
- Java JDK (11+ recommended) installed and on your PATH
- BlueJ (optional, recommended for this project)

Run in BlueJ (recommended):
1. Open BlueJ and load the project folder containing these files.
2. Compile all classes (BlueJ provides a "Compile" or "Compile All" button).
3. Right-click on `Runner` and select "void main(String[] args)" or use the play/run option to start the game.

Run from the command line:

```bash
# Compile
javac *.java

# Run
java Runner
```

If you see compilation errors referencing your Java version, ensure your `javac` and `java` point to the same JDK installation.

## What I Learned

- Object-oriented design: I applied inheritance to model shared behavior in `Tower` and `Enemy` base classes and used subclasses for specialized behavior.
- Polymorphism: The game loop interacts with towers and enemies through base-class interfaces, enabling flexible addition of new types.
- Game loop fundamentals: Implemented update and render cycles inside `GamePanel` to manage timing and animations.
- Tradeoffs in design: I balanced clarity and extensibility—keeping logic split across small, focused classes made adding new towers or enemies straightforward.
- Development with BlueJ: Quick visual compilation and testing made iterative development easier, especially while experimenting with behavior and balancing.

## Next Steps (optional)

- Add save/load or level progression.
- Implement a simple UI for placing towers and showing wave info.
- Add unit tests for core game logic (e.g., damage calculations, pathfinding decisions).

---
