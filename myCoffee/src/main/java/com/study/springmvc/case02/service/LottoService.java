package com.study.springmvc.case02.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class LottoService {
	private List<Set<Integer>> lottos = new ArrayList<>();
	
	public List<Set<Integer>> getLottos() {
		return lottos;
	}
	
	public void addLotto() {
		lottos.add(0, generateLotto());
	}
	
	public void updateLotto(int index) {
		lottos.set(index, generateLotto());
	}
	
	public void deleteLotto(int index) {
		lottos.remove(index);
	}
	
	private Set<Integer> generateLotto() {
	Random r = new Random();
	// �ֳz 539: 1~39 ���X�����ƪ�5�Ӹ��X
	Set<Integer> lotto = new LinkedHashSet<>();
	while(lotto.size() < 1) {
		lotto.add(r.nextInt(9) + 1);
	}
	return lotto;
	}

}


//private Set<Integer> generateLotto() {
//	Random r = new Random();
//	// �ֳz 539: 1~39 ���X�����ƪ�5�Ӹ��X
//	Set<Integer> lotto = new LinkedHashSet<>();
//	while(lotto.size() < 5) {
//		lotto.add(r.nextInt(39) + 1);
//	}
//	return lotto;
//	}