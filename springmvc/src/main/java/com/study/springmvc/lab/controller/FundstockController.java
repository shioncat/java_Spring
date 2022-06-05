package com.study.springmvc.lab.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.validation.Valid;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springmvc.lab.entity.Fund;
import com.study.springmvc.lab.entity.Fundstock;
import com.study.springmvc.lab.repository.FundDao;
import com.study.springmvc.lab.repository.FundstockDao;
import com.study.springmvc.lab.validator.FundstockValidator;

@Controller
@RequestMapping("/lab/fundstock")
public class FundstockController {
	
	private List<Fundstock> fundstocks =new CopyOnWriteArrayList<>();
	
	@Autowired 
	private FundstockValidator fundstockValidator;
	
	@Autowired
	private FundstockDao fundstockDao;
	
	@Autowired
	private FundDao fundDao;
	
	private int pageNumber = -1;
	
	@GetMapping("/")
	public String index(@ModelAttribute Fundstock fundstock, Model model) {
		
		model.addAttribute("fundstocks", fundstockDao.queryAll());
		return "redirect:./page/" + pageNumber;
	}
	
	@GetMapping("/page/{pageNumber}")
	public String page(@PathVariable("pageNumber") int pageNumber, @ModelAttribute Fundstock fundstock, Model model) {
		this.pageNumber = pageNumber;
		int offset = (pageNumber-1) * FundstockDao.LIMIT;
		List<Fundstock> fundstocks =  fundstockDao.queryPage(offset);
		List<Fund> funds = fundDao.queryAll();
		int pageTotalCount = fundstockDao.count() / FundstockDao.LIMIT;
		model.addAttribute("_method", "POST");
		model.addAttribute("fundstocks", fundstocks);
		model.addAttribute("funds", funds);
		model.addAttribute("pageTotalCount", pageTotalCount);
		model.addAttribute("groupMap", getGroupMap());
		return "lab/fundstock";
	}
	
	@GetMapping("/{sid}")
	@ResponseBody
	public Fundstock get(@PathVariable("sid") Integer sid, Model model) {	
		model.addAttribute("fundstocks", fundstocks);
		return fundstockDao.get(sid);
	}
	
	private Map<String, Integer> getGroupMap() {
		// select s.symbol, sum(s.share) as share
		// from fundstock s
		// group by s.symbol
		List<Fundstock> fundstocks = fundstockDao.queryAll();
		return fundstocks.stream()
						 .collect(groupingBy(Fundstock::getSymbol, 
											 summingInt(Fundstock::getShare)));
	}
	
	@PostMapping("/")
	public String add(@Valid Fundstock fundstock, BindingResult result, Model model) {
		// 自主驗證錯誤
		fundstockValidator.validate(fundstock, result);
		if(result.hasErrors()) {
			model.addAttribute("foundstocks", fundstocks);
			return "lab/fundstock";
		}
		fundstockDao.add(fundstock);
		return "redirect:./";

	}
	
	@PutMapping("/")
	public String update(@PathVariable("sid") Integer sid,@Valid Fundstock fundstock, BindingResult result, Model model) {
		fundstockDao.update(fundstock);
		return "redirect:./";
	}
	
}
