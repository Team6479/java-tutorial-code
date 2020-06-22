package javabasics;

public class Conditionals {
	public static void main(String[] args) {
		
		//Comparison Operators
		//== < > <= >=

		int number = 4;
		
		//basic if-else statement
		
		if(number % 2 == 1) {
			System.out.println(number);
		} else {
			System.out.println("you're number is even.");
		}
		
		//if - elseif - else statements
		
		int grade = 65;
		
		if(grade >= 90) {
			System.out.println("A");
		}
		else if(grade >= 80) {
			System.out.println("B");
		}
		else if(grade >= 70) {
			System.out.println("C");
		}
		else if(grade >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		//logical operators: &&, ||, !
		
		//&&:
		//true + true --> true
		//true + false --> false
		//false + true --> false
		//false + false --> false
		
		//||:
			//true + true --> true
			//true + false --> true
			//false + true --> true
			//false + false --> false
		
		//! --> makes it oppposite value
		
		int x = 6;
		
		if( !(x >= 10) || (x <= 20) ) {
			System.out.println(x);
		}
	}

}