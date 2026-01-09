package com.kh.practice.file.run;

import java.io.FileNotFoundException;

import com.kh.practice.file.view.FileMenu;

public class Run {
	public static void main(String[] args) throws FileNotFoundException {
		FileMenu fm = new FileMenu();
		fm.mainMenu();
	}
}
