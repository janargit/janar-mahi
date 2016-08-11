package com.infinite;

import com.test.FactorialApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FactorialApp app = new FactorialApp();
        System.out.println("Factorial of 10::"+app.getFactorial(10));
    }
}
