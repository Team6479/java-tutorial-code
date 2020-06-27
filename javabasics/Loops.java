package javabasics;

public class Loops {

    public static void main(String[] args){
        //for loop
		for(int i = 1; i <= 10; i++) {
			if(i == 7) {
				break;
			}
			System.out.println(i);

		}
		
		//while loop
		int x = 0;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
	
		//do-while loop
		int y = 0;
		do {
			System.out.println("do while!");
			y++;
		} while(y > 10); //condition is false but it will still print once
        
        
		//continue and break
		//continue -> if used it will continue to the next iteration without executing any
		//code that comes after it's written
		//break -> completely exits the loop
    }
    
    
}