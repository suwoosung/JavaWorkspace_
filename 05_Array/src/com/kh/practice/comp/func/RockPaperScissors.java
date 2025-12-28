package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	Scanner sc = new Scanner(System.in);

	public void rps() {
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		int wins = 0;
		int losses = 0;
		int draws = 0;
		int count = 0;
		
		while(true) {
			
			System.out.print("가위바위보 : ");
			String  user = sc.next();
			
			if (user.equals("exit")) {
				System.out.println(count+"전 "+wins+"승 "+draws+"무 "+losses+"패");
				break;
			}
			
			if (!(user.equals("가위") || user.equals("바위") || user.equals("보"))){
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			
			String[] arr = {"가위", "바위", "보"};
			int random = (int) (Math.random()*3);
			String str = arr[random];
			
			System.out.print("컴퓨터 : ");
			System.out.println(str);
			
			if (user.equals(str)) {
				System.out.println("비겼습니다.");
				System.out.println();
				draws++;
				count++;
			} else if (user.equals("가위") && str.equals("보")
					|| user.equals("바위") && str.equals("가위")
					|| user.equals("보") && str.equals("바위")) {
				System.out.println("이겼습니다.");
				System.out.println();
				wins++;
				count++;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				System.out.println();
				losses++;
				count++;
			} 
		}
	}
}
