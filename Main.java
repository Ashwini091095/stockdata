package com.codingtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {

	String filename1="cm29JAN2020bhav.csv";
	String filename2="cm30JAN2020bhav.csv";
	String filename3="cm31JAN2020bhav.csv";
	
	File file=new File(filename1);
	try {
		Scanner sc=new Scanner(file);	
		sc.next();
		double sum=0;
		double numberOfPrices=0;
		float range;
		while(sc.hasNext())
		{
			String data=sc.next(); //gets a whole line
		//	System.out.println(data);
		    String[] column=data.split(","); //split it by commas
			float high=Float.parseFloat(column[3]);
			float low=Float.parseFloat(column[4]);
			
			 System.out.println(range=(high-low));
			 sum += range;
			 numberOfPrices++;
			 System.out.println("Average="+(sum/numberOfPrices));
		}
		sc.close();
		}
		catch(FileNotFoundException e) {
	e.printStackTrace();
	}

	
	try {
		PrintWriter pw=new PrintWriter("output.csv");
		BufferedReader br=new BufferedReader(new FileReader("cm29JAN2020bhav.csv"));
		String line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
			
		}
		
		}
		 catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	

}
}
