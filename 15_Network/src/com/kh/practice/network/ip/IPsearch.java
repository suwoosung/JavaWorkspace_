package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class IPsearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 : ");
		String hostname = sc.next();
		
		try {
			InetAddress[] arr = InetAddress.getAllByName(hostname);
			System.out.println(hostname+"은 "+arr.length+"개의 주소를 가지고 있습니다.");
			
			int count = 1;
			for(InetAddress ia : arr) {
				System.out.println(count++ +"번 IP = "+ia.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
