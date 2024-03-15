package com.javaFileHndlingWithCharacterData;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

	/**
	 * 
	 * Write a java program to read character data from file1.txt file, and write the data into file2.txt file
	 * using FileReader and FileWrite classes.
	 * 
	 * for example 'file1.txt' file has a data as 'Hello Guys, How are you, how your doing.' 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
	
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\file1.txt");
		FileReader fileReader = new FileReader(inputFile);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\file2.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		
		try
		{
			int i = 0;
			
			while((i = fileReader.read()) != -1)
			{
				fileWriter.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileReader.close();
			fileWriter.close();
		}
		
		
	}

}
