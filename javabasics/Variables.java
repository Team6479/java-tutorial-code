package javabasics;

public class Variables{

  public static void main(String[] args){
    
    int age = 17; //declared + initialized the variable
		System.out.println(age);
		
		boolean isSenior = false;
		System.out.println(isSenior);
		
		char lastInitial = 'S';
		System.out.println(lastInitial);
		
		double gpa = 9.0;
		System.out.println(gpa);
		
		String name = "Bob";
		System.out.println(name);
		
		//rules for naming variables:
		
		//1. name must start with a letter
		
		//2. name cannot contain any spaces
		
		//3. name cannot contain any special characters EXCEPT _ and $
		
		
		int a = 5;
		
		//basic arithmetic operators:
		
		System.out.println(a + 2); //4
		System.out.println(a - 2); //0
		System.out.println(a * 2); //4
		System.out.println(a / 2); //1
		
		//modulus operator: %
		System.out.println(a % 2);
		
		
		//incrementing and decrementing with the '++' and '--'
		
		System.out.println(a);
		a++;
		System.out.println(a);	
		
		//performing an arithmetic operation then storing the result back
		//into the variable; can be done with all 5 operators (+, -, *, /, %)
		//shorter version of 'a = a * 3'
		a *= 3;
		System.out.println(a);	
		
		
		//danger of integer division
		//when dividing 2 ints, if there is a decimal, it will cut it off
		int x = 4;
		int y = 5;
		System.out.println(y / x); //prints out 1 instead of 1.25
  }

}