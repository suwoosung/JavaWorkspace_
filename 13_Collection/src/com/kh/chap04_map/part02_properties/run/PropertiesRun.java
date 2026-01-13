package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		/*
		 * Properties
		 *  - Map계열 인터페이스를 구현한 클래스로, key,value쌍으로 값을 저장
		 *  - 단, Properties는 key,value값을 모두 "String"으로 관리하는 것을
		 *  권장하며, 파일입출력메서드(io)를 지원한다.
		 *  - 주로 프로젝트의 성적정보를 기록하는데 사용된다.
		 */
		Properties prop = new Properties();
		
		// map계열 인터페이스를 구현하였기 때문에 put메서드 사용 가능.
		// prop.put("다이제", new Snack("초코맛",500));
		
		// 1. setProperty(String, String)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String Key)
		// - key에 저장된 value값을 가져오는 메서드
		System.out.println(prop.getProperty("Set"));
		
		// 3. stor(OutputStream os, String Comments)
		//  - prop에 담긴 key,value를 모두 출력스트림을 황용하여 출력하는 메서드
		
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 4. load(InputStream is) : properties를 읽어오는데 사용하는 메서드
		Properties prop2 = new Properties();

		System.out.println(prop2);
		
		try {
			prop2.load(new FileInputStream("test.properties"));
			
			System.out.println(prop2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
