package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {
	public static void main(String[] args) {
		/*
		 * 문자 기반 스트림
		 *  - 외부매체를 지정하여 외부매체와 연결하는 역할을 수행
		 *  - 연결된 외부매체와 2byte단위로 데이터를 주고받는 역할을 수행
		 *  - XXXReader / XXXWriter
		 */
		FileCharDao dao = new FileCharDao();
		dao.filesave();
		dao.fileRead();
	}
}
