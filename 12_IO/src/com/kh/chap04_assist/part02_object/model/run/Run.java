package com.kh.chap04_assist.part02_object.model.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectDao1;

public class Run {
	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
		//dao.fileSave();
		//dao.fileRead();
		
		ObjectDao1 dao1 = new ObjectDao1();
		dao1.fileSave();
		dao1.fileRead();
	}
}
