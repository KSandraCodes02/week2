package day7;

import java.util.Scanner;

public class avengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int black = 5;
		int pink = 10;
		int blue = 15;
		
		
		Scanner ecn = new Scanner(System.in);
		
		String name =("");
		String color =("");
		System.out.println("Enter name");
		name = ecn.next();
		System.out.println("What is your favorite color");
		ecn.next();
		
		System.out.println("Enter first number");
		black = ecn.nextInt();
	
		System.out.println("Enter  second number ");
		pink = ecn.nextInt();
		
		
		
		System.out.println("Caculating......Addition.....Here is your answer");
		
		blue = black + pink;
		
		System.out.println(blue );
		
		System.out.println("Caculating......Subtraction.......Here is your answer");
		
		blue =  black - pink;
		
		System.out.println(blue );
		
		System.out.println("Caculating......Multiplication.......Here is your answer");
		
		blue = black * pink;
				
		System.out.println(blue);
		
		System.out.println("Caculating......Division......Here is your answer");
		
		blue = black / pink;
		
		System.out.println(blue);
		
		
		System.out.println("Thank you for participating " + color);
	}
		
}
