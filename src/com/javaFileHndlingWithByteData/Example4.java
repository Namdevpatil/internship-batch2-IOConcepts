package com.javaFileHndlingWithByteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {

	/**
	 * 
	 * Write a java program to read byte data from A.txt file, and write the data into B.txt file
	 * using FileInputStream and FileOutputStream classes
	 * 
	 * for example 'A.txt' file has a data as 'Welcome to JNTUK University' 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
	
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\A.txt");
		FileInputStream inputStream = new FileInputStream(inputFile);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\B.txt");
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		
		try
		{
			int i = 0;
			
			while((i = inputStream.read()) != -1)
			{
				outputStream.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			inputStream.close();
			outputStream.close();
		}
		
		
	}

}
