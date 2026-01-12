package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List list = new ArrayList();

	public int addList(Music music) {
		// 마지막 리스트에 객체 저장, 1 리턴
		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {
		try {
			list.add(0, music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public List pritAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music m = null;
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		for (Object o : list) {
			Music music = (Music) o;
			
			if (music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		return m;
	}

	public Music removeMusic(String title) {
		Music m = null;
		// 방법1.
		for (int i = 0; i < list.size(); i++) {
			Music music = (Music) list.get(i);
			if (music.getTitle().equals(title)) {
				m = music;
				list.remove(i);
			}
		}

//		// 방법2.
//		Object o = searchMusic(title);
//		m = (Music) o;
//		list.remove(o);
//
		return m;
	}

	public Music setMusic(String title, Music music) {

		try {
			Music result = null;
			int index = 0;

			for (int i = 0; i < list.size(); i++) {
				Music m = (Music) list.get(i);
				if (m.getTitle().equals(title)) {
					index = i;
					result = m;
					break;
				}
			}
			list.set(index, music);
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		return 1;
	}

	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
