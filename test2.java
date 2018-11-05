package com.kgc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test2 {

	public static void main(String[] args) {
      //读取字母存在的位置
		try {
			File file =new File("d:/demo.txt");
			FileInputStream fi=new FileInputStream(file);
		   byte[]v=new byte[5];
		   fi.skip(1);
		   fi.read(v);
		   for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
