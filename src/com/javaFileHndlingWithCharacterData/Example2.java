package com.javaFileHndlingWithCharacterData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

	/**
	 * 
	 * Write a java program to read character data from file2.txt file, and write the data into file3.txt file
	 * using FileReader and FileWrite classes, also we can use BufferedReader and BufferedWriter classes for better performance
	 * 
	 * for example 'file3.txt' file has a data as 'Hello Guys, How are you, how your doing.' 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
	
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\file2.txt");
		FileReader fileReader = new FileReader(inputFile);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\file3.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		try
		{
			int i = 0;
			
			while((i = bufferedReader.read()) != -1)
			{
				bufferedWriter.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedReader.close();
			bufferedWriter.close();
		}
		
		
		
	}

}
