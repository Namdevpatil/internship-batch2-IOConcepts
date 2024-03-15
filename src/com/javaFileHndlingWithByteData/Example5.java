package com.javaFileHndlingWithByteData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	/**
	 * 
	 * Write a java program to read byte data from A.txt file, and write the data into B.txt file
	 * using FileInputStream and FileOutputStream classes. besides use BufferedInputStream and BufferedOutputStream classes
	 * 
	 * for example 'A.txt' file has a data as 'Welcome to JNTUK University' 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
	
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\A.txt");
		FileInputStream inputStream = new FileInputStream(inputFile);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\C.txt");
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 5);
		
		try
		{
			int i = 0;
			
			while((i = bufferedInputStream.read()) != -1)
			{
				bufferedOutputStream.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedInputStream.close();
			bufferedOutputStream.close();
		}
		
		
	}

}
