package com.javaFileHndlingWithByteData;

import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	{
	
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship2\\IO\\hello.txt");
		
		try
		{
			boolean status = file.exists();
			
			if(status)
			{
				System.out.println("file is exists");
			}
			else
			{
				System.out.println("file is not exists");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
