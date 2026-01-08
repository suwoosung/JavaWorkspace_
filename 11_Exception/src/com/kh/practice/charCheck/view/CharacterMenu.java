package com.kh.practice.charCheck.view;

import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			int count = cc.countAlpha(str);
			System.out.print(str + "에 포함된 영문자 개수 : "+count);
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
	}
}
