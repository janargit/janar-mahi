package com.test;

/**
 * Hello world!
 *
 */
public class FactorialApp 
{
   public int getFactorial(int value){
	   if(value==0)
		   return 1;
	   int factorial = 1;
	   for(int i=1;i<=value;i++){
		   factorial = factorial * i;
	   }
	   System.out.println("factorial of "+value+" is::"+factorial);
	   return factorial;
   }
}
