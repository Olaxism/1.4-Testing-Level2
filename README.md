# Tasca-S1.04.-Testing
📄 Description - Exercise Statement
Restaurant Management Exercise with Java

Implement a system that manages a set of restaurants using a HashSet to avoid duplicates. The exercise demonstrates:

Use of Java collections (HashSet, ArrayList)

Proper implementation of equals() and hashCode() methods

Object sorting using lambdas

Iteration with for-each

Statement:
Create an application that:

Stores restaurants in a HashSet to avoid duplicates

Converts the HashSet to ArrayList for sorting

Sorts restaurants by descending rating

Displays the final result

💻 Technologies Used
Java 8+ - Programming language

Java Collections Framework - HashSet, ArrayList

Object-Oriented Programming - Classes, methods, encapsulation

Lambda Expressions - For custom sorting

📋 Requirements
Software Requirements:

Java Development Kit (JDK) 8 or higher

Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor

Command Line Interface (optional)

Project Dependencies:

No external libraries required

Uses only standard Java SE libraries

🛠️ Installation
Step-by-step installation guide:

Clone or download the project:

bash
git clone <repository-url>
Or download the ZIP file and extract it

Navigate to project directory:

bash
cd restaurant-management
Verify Java installation:

bash
java -version
javac -version
Compile the Java files:

bash
javac *.java
▶️ Execution
Running the application:

Method 1: Using Command Line

bash
java Main
Method 2: Using an IDE

Open the project in your preferred IDE

Locate the Main.java file

Run the main method

Expected Output:

text
Can Punyetes - Score: 9
El sazón - Score: 8
El Pendejo - Score: 8
Oishi - Score: 7
El sazón - Score: 5
🌐 Deployment
For production deployment:

Create JAR file:

bash
jar cfe restaurant-app.jar Main *.class
Deploy the JAR:

bash
java -jar restaurant-app.jar
Docker deployment (optional):

dockerfile
FROM openjdk:11-jre-slim
COPY . /app
WORKDIR /app
CMD ["java", "Main"]
🤝 Contributions
Guidelines for contributing:

Fork the repository

Create a feature branch:

bash
git checkout -b feature/new-feature
Follow code style:

Use meaningful variable names

Include comments for complex logic

Maintain proper indentation

Testing:

Ensure all functionality works

Test edge cases

Verify no duplicates in HashSet

Submit pull request with clear description of changes

Code Standards:

Use English for variable names and comments

Follow Java naming conventions

Implement proper equals() and hashCode() for custom classes

Handle exceptions appropriately