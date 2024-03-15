package com.javaFileHndlingWithByteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
	
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\hello.txt");
		FileInputStream inputStream = new FileInputStream(file);
		
		try
		{
			int i = 0;
			
			while((i = inputStream.read()) != -1)
			{
				System.out.print((char)i);
			}
			//System.out.println(inputStream.read());		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			inputStream.close();
		}
		
		
	}

}
