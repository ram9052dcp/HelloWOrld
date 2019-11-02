package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
			/*File file =new File("ram\\vvv");
			file.mkdirs();
			file.createNewFile();
			System.out.println("ccc");
			
			File fi = new File("ram\\\\vvvddd.txt");
			fi.createNewFile();*/
		
		File fi = new File("oracle");
		fi.mkdir();
		fi=new File("oracle\\cccc.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fi, true)))
		{
			bw.write("cccccc");
			bw.newLine();
			bw.write("cccccc");
			bw.write("cccccc");
			bw.write("cccccc");
			bw.write("cccccc");
			
			bw.write("cccccc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ccsfsdfsf");
		}
			
	}

}
