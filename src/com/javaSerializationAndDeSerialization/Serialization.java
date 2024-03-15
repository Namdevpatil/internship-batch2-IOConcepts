package com.javaSerializationAndDeSerialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization 
{

	public static void main(String[] args) throws IOException
	{
	
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\customerObject.txt");
		FileOutputStream outputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		
		try
		{
			
			Customer customer = new Customer(2211, "Dev", "Hyderabad");
			
			objectOutputStream.writeObject(customer);
			
			System.out.println("an object customer is stored in the file.");
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			objectOutputStream.close();
		}
		
		
	}

}
