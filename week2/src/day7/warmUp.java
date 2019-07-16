package day7;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int letter= 20; 
		int pink = 11;
		int purple= 8;
		
		String name="";
		
		System.out.println("");
		System.out.println("What is your name");
		name = scnr.next();
		
		System.out.println("Hello. Welcome to the super caculator");
		System.out.println("Enter a number");
		pink = scnr.nextInt();
		System.out.println(" Enter a number ");
		letter = scnr.nextInt();
		pink = purple + letter;
		System.out.println(purple);
		
		 
		System.out.println("this is the difference");
		
		 int pink1 = purple - letter;
		 
		 System.out.println(pink1);
		 
		System.out.println("this is the pruduct");
		
		int pink2 = purple * letter;
		
		System.out.println(pink2);
		
		System.out.println("this is the sum");
		
		int pink3 = purple + letter;
		
		System.out.println(pink3);
		 
		System.out.println("this is the quotient");
		
		int pink4 = purple / letter;
	
		System.out.println(pink4);
		
		System.out.println("Thanks for participating " + name);
		
		scnr.close();
	}

}
