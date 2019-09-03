# Visual Studio Code

Visual Studio Code is a source-code editor developed by Microsoft for Windows, Linux and macOS.
This guide is aimed to assist a complete beginner with installation of Visual Studio Code, as well as using it with the project.
If you find anything missing contact ZweiEuro#2274 on Discord.

- [What is an IDE](#what-is-an-ide)
- [Getting Visual Studio Code](#getting-visual-studio-code)
- [Setting up Visual Studio Code](#setting-up-visual-studio-code)
  - [Extensions](#extensions)
  - [Opening the project](#opening-the-project)
  - [Running the project](#run-the-project-in-vsc)

## What is an IDE

An IDE is a piece of software designed to make development of other software easier. It contains multiple different sets of tools for debugging, testing, and collaboration. This makes it possible to quickly and efficiently implement new features, refactor old ones, and fix bugs.

## Getting Visual Studio Code

Download Visual Studio Code: <https://code.visualstudio.com/#alt-downloads>

## Setting up Visual Studio Code

If you do not have JDK installed, Visual Studio Code will offer you to do so. World War of Ants is using JDK 8.

### Extensions

After launching Visual Studio Code for the first time, we can install a Java Extension to make working with the language more more comfortable.
You can open the Extensions tab by pressing the ![extensions](images/extensions_menu.PNG) button on the left vertical bar.
Download the [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

### Opening the project

In Visual Studio Code Menu Bar, select "File", then "Open Folder...". Navigate to the parent folder of cloned repository and press "Select folder" with repository folder selected.

Give Visual Studio Code a few moments to process everything - you should be able to see its current task in the Status Bar, at the bottom of application window.

### Running the project

When a Java program is run, it executes the code in its Main method. Using the tree on the left, navigate to src\main\java\com\worldwarofants\game, and open Main.java. Inside, you'll see a line that says

```java
public static void main(String[] args)
```

Above it, you'll see buttons `Run | Debug`. Pressing `Run` will allow you to run the program.
