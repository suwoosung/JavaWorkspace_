package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean result = false;

		result = lottery.remove(l);

		if (win != null && result) {
			win.remove(l);
		}
		return result;
	}

	public HashSet winObject() {

		List<Lottery> list = new ArrayList<>(lottery);
		Collections.shuffle(list);
		
		if(list.size() < 4) {
			return null;
		}
		
		for (int i = 0; win.size() < 4; i++) {
			win.add(list.get(i));
		}
		return win;
	}

	public TreeSet sortedWinObject() {
		winObject(); // 당첨자 목록 채우기
		
		TreeSet<Lottery> set = new TreeSet(new SortedLottery());
		set.addAll(win);
		
		return set;
	}

	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
