# Java Pipeline Demo

This is a simple Java project used to demonstrate **GitHub Actions CI** with **Super-Linter** and **Checkstyle**.  
It contains a single entry-point class:

```java
package com.main;

/**
 * Entry point of the application.
 */
public final class MainClass {
    private MainClass() {
        // Prevent instantiation
    }

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     * @throws Exception if any error occurs during execution
     */
    public static void main(final String[] args) throws Exception {
        System.out.println("here goes the pipeline");
    }
}
```


🚀 Getting Started
Prerequisites

Java 11+ (JDK)

Git

(Optional) Maven or Gradle for build automation

Compile
javac -d out src/main/java/com/main/MainClass.java

Run
java -cp out com.main.MainClass

✅ Linting with Super-Linter

This project uses GitHub Super-Linter
 to enforce code quality.
It runs automatically in GitHub Actions whenever you push or open a pull request.

The rules are defined in .checkstyle.xml
.

Example checks:

No wildcard imports (import java.util.*;)

package-info.java required for each package

Javadoc required for public classes and methods

Consistent brace style and indentation

📂 Project Structure
```
├── .github/
│   └── workflows/
│       └── linter.yml     # GitHub Actions workflow for Super-Linter
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── main/
│                   ├── MainClass.java
│                   └── package-info.java
├── .checkstyle.xml        # Checkstyle configuration
└── README.md
```

⚙️ GitHub Actions Workflow

Sample workflow (.github/workflows/linter.yml):

```yml
name: Lint Code Base

on:
  push:
  pull_request:

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout Code
        uses: actions/checkout@v4
      - name: Lint Code Base
        uses: github/super-linter@v5
        env:
          VALIDATE_JAVA: true
          DEFAULT_BRANCH: main
          CHECKSTYLE_CONFIG_FILE: .checkstyle.xml
```
