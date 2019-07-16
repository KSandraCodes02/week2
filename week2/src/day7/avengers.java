package day7;

import java.util.Scanner;

public class avengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int black = 4;
		int pink = 10;
		int blue = 15;
		
		
		Scanner ecn = new Scanner(System.in);
		
		String name =("");
		
		System.out.println("Enter name");
		name = ecn.next();
		System.out.println("What is your favorite color");
		ecn.next();
		
		System.out.println("Enter a number");
		black = ecn.nextInt();
	
		System.out.println("Enter a second number");
		pink = ecn.nextInt();
		
		
		
		System.out.println("Addition");
		
		blue = black + pink;
		
		System.out.println(blue);
		
		System.out.println("Subtraction");
		
		blue =  black - pink;
		
		System.out.println(blue);
		
		System.out.println("Multiplication");
		
		blue = black * pink;
				
		System.out.println(blue);
		
		System.out.println("Division");
		
		blue = black / pink;
		
		System.out.println(blue);
		
		
		System.out.println("Thank you for participating " + name);
	}
		
}
