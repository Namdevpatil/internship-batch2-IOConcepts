package com.javaIOConcepts;

import java.util.Scanner;

public class Example3 
{

	public static void main(String[] args) 
	{
		
		int value1, value2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		value1 = scanner.nextInt();//reading input from the console
		
		System.out.println("Enter second value: ");
		value2 = scanner.nextInt();//reading input from the console
		
		scanner.close();
		
		int product = value1*value2;//operation
		
		System.out.println(product);//writing output to the console

	}

}
