# Tasca-S1.04.-Testing

📄 Description 
- 
- Exercise Statement
This project consists of implementing a book management system for a library with unit tests using JUnit 5. The system allows managing a book collection while ensuring automatic alphabetical ordering and duplicate prevention.

💻 Technologies Used
- 

Java 17

JUnit 5

Maven

IntelliJ IDEA (optional)

📋 Requirements
-
Java JDK 17 or higher

Apache Maven 3.8+

JUnit 5.9.2

Operating System: Windows 10/11, macOS 10.14+, or Linux Ubuntu 18.04+

🛠️ Installation
-
Clone this repository:

bash
git clone https://github.com/your-username/library-testing.git
Access the project directory:

bash
cd library-testing
Install dependencies:

bash
mvn clean install
Configure the project in IntelliJ IDEA:

Open the project

Configure JDK 17

Mark src/test/java as Test Sources Root

▶️ Execution
-
Compile the project:

bash
mvn clean compile
Run tests:

bash
mvn test
Run specific test:

bash
mvn test -Dtest=BibliotecaTest
Run from IntelliJ IDEA:

Open BibliotecaTest.java

Click the ▶️ button next to each test

Or press Ctrl+Shift+F10 (Windows/Linux) / Ctrl+Shift+R (macOS)

🌐 Deployment
-
Prepare production environment:

bash
mvn clean package -DskipTests
Run tests in integration mode:

bash
mvn verify
Generate coverage report:

bash
mvn jacoco:report
For continuous integration:

bash
# Configuration for GitHub Actions
-
mvn test -DskipTests=false
🤝 Contributions
Contributions are welcome! Please follow these steps to contribute:

Fork the repository

Create a new branch:

bash
git checkout -b feature/NewFeature
Make your changes and commit them:

bash
git add .
git commit -m 'Add New Feature'
Push changes to your branch:

bash
git push origin feature/NewFeature
Create a pull request

Contribution Guidelines:
-
Follow existing code style

Write tests for new features

Ensure all tests pass

Update documentation if necessary

Use descriptive names for variables and methods