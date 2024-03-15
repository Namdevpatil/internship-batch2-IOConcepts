package com.javaIOConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 
{

	public static void main(String[] args) throws IOException
	{
		
		int value1, value2;
		
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
				
		try
		{
			
			System.out.println("Enter first value: ");
			value1 = Integer.parseInt(reader.readLine()); //reading input from the console
			
			System.out.println("Enter second value: ");
			value2 = Integer.parseInt(reader.readLine());//reading input from the console
			
			int product = value1*value2;//operation
			
			System.out.println(product);//writing output to the console
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			reader.close();
		}

	}

}
