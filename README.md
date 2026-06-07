## Project Overview
This project is a Pet Daycare Management System developed for EE1004 Java Programming course project assignment. The application provides a platform to register pets, monitor daily meal plans, and review care instructions. The software features both a terminal-based interface and a Graphical User Interface.

---

## Environment Specifications
- **Operating System:** Fedora Linux and Windows 11
- **Java Development Kit (JDK):** OpenJDK 25.0.3
- **IDEs / Text Editors:** Neovim and Visual Studio Code
- **Compiler toolchain:** Standard Java Compiler (`javac`)

---

## Project Directory Structure
```text
EE1004_Group08_PetDaycare/
 ├── .gitignore
 ├── README.md
 └── src/
      ├── Pet.java
      ├── Dog.java
      ├── Cat.java
      ├── Bird.java
      ├── PetDaycare.java
      ├── Main.java
      └── DaycareGUI.java

```

---

## How to Build and Run

### 1. Compilation

Navigate to the root project directory in your terminal and compile all files located in the source folder:

```bash
javac src/*.java

```

### 2. Launching the GUI Application

To execute the application with the graphical user interface:

```bash
java -cp src DaycareGUI

```

### 3. Launching the Console Version

To run the standard command-line version:

```bash
java -cp src Main

```

