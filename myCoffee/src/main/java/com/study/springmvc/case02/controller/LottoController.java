package com.study.springmvc.case02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springmvc.case02.service.LottoService;

@Controller
@RequestMapping("/case02/lotto")
public class LottoController {
	
	@Autowired
	private LottoService lottoService;
	
	// lotto �D�e��
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("lottos", lottoService.getLottos());
		return "/WEB-INF/views/case02/show_lotto";
	}
	
	// �q���︹
	@RequestMapping("/add")
	public String add() {
		lottoService.addLotto();
		return "redirect:./";
	}
	
	// �ק����
	@RequestMapping("/update/{index}")
	public String update(@PathVariable("index") int index) {
		lottoService.updateLotto(index);
		return "redirect:../";
	}
	
	// �R������
	@RequestMapping("/delete/{index}")
	public String delete(@PathVariable("index") int index) {
		lottoService.deleteLotto(index);
		return "redirect:../";
	}
	
	
}