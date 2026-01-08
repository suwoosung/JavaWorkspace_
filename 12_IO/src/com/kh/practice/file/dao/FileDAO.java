package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		File f = new File(file);
		
		if(!(f.exists())) {
			f.mkdir();
		}
		return f.mkdir();
	}
	
	public void fileSave(String file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("file", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String arr = file;
		try {
			fw.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		FileReader fr = null;
		
		int value = 0;
		fr = new FileReader(file);
		if ((value = fr.read())!=-1) {
			System.out.print((char) value);
		}
		return fr.read();
	}
	
	public void fileEdit(String file) {
		
	}
}
