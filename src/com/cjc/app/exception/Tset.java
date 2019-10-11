package com.cjc.app.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tset 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		PrintWriter pw= new PrintWriter("abc.txt");
		pw.println("Hello");
		System.out.println(10/0);
	}

}
