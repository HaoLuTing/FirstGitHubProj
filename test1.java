package com.kgc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
        try {
			FileOutputStream fos=new FileOutputStream("d:/demo.txt");
			fos.write('a');
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
