package com.javaFileHndlingWithByteData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
	
		String text = "Welcome to JNTUK University";
		
		byte byteValues[] = text.getBytes();
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\hello.txt");
		FileOutputStream outputStream = new FileOutputStream(file);
		
		try
		{
			if(outputStream != null)
			{
				outputStream.write(byteValues);
			}			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			outputStream.close();
		}
		
		
	}

}
