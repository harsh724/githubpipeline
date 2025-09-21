package com.main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
    @Test(dataProvider = "dp")
    public void test1(String param1, String param2){
        System.out.println("Test1: "+param1+" and "+param2);
    }

    @DataProvider(name = "dp")
    public Object[][] dataProvider(){
        return new Object[][] {{"hello", "world"}
                , {"testcase", "second"}};
    }
}
