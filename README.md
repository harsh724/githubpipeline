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
