package day6;

import java.util.Scanner;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scnr = new Scanner(System.in);
		
		
		int number= 15; 
		int black= 18;
		int gray= 20;
		
		
		
		
		System.out.println("Welcome to the super caculator");
		System.out.println("Enter a number");
		number = scnr.nextInt();
		System.out.println(" Enter a number ");
		black = scnr.nextInt();
		gray = number + black;
		System.out.println(gray);
		
		 
		System.out.println("this is the difference");
		
		 int number1 = gray - black;
		 
		 System.out.println(number1);
		 
		System.out.println("this is the pruduct");
		
		int number2 = gray / black;
		
		System.out.println(number2);
		
		System.out.println("this is the sum");
		
		int number3 = gray + black;
		
		System.out.println(number3);
		 
		System.out.println("this is the quotient");
		
		int number4 = gray * black;
		
		System.out.println(number4);
		
		scnr.close();
		
	}

}
