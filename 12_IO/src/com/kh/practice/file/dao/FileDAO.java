package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {

		File f = new File(file);
		return f.exists();
	}

	public void fileSave(String file, String s) {

		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public StringBuilder fileOpen(String file) {

		StringBuilder sb = new StringBuilder();
		int value = 0;

		FileReader fr = null;
		try {
			fr = new FileReader(file);
			while ((value = fr.read()) != -1) {
				sb.append((char) value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}

	public void fileEdit(String file, String s) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
