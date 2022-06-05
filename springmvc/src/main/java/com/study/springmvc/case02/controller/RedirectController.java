package com.study.springmvc.case02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/case02/redirect")
public class RedirectController {
	// ���w�V redirect:
	// �� server �ݵo�X redirect �R�O(�|��b header ��)�� client �ݡA�å� client �ݥh����
	// �ҥH client �ݪ��s�������}�|����
	// ���w�V�i�H���V�����P�~��
	
	@RequestMapping("/demo1")
	public String demo1() {
		return "redirect:/index.jsp";
	}
	
	// Lab (demo2)�ڭn�z�L redirect: ���w�V��e�ݺ��� show_time.jsp �n�p��g�H
	// http://localhost:8080/springmvc/mvc/case02/redirect/demo2
	// http://localhost:8080/springmvc/mvc/case02/time/now
	@RequestMapping("/demo2")
    public String demo2(){
        //return "redirect:/mvc/case02/time/now"; // ������|
		return "redirect:../time/now"; // �۹���|
    }
	
	@RequestMapping("/demo3")
    public String demo3(){
        return "redirect:http://tw.yahoo.com"; // �~��
    }
	
	// ���w�V�a�Ѽ� I
	@RequestMapping("/demo4")
	public String demo4() {
		return "redirect:/show_param.jsp?username=Vincent&age=18";
	}
	
	// ���w�V�a�Ѽ� II
	@RequestMapping("/demo5")
	public String demo5(RedirectAttributes attr) {
		attr.addAttribute("username", "Anita");
		attr.addAttribute("age", "19");
		return "redirect:/show_param.jsp";
	}
	
	// ���w�V�a�Ѽ� III (addFlashAttribute)
	// http://localhost:8080/springmvc/mvc/case02/redirect/saveOrder?name=iPhone&price=25000&qty=5
	@RequestMapping("/saveOrder")
	public String saveOrder(@RequestParam("name") String name, 
							@RequestParam("price") Integer price,
							@RequestParam("qty") Integer qty,
							RedirectAttributes attr) {
		attr.addFlashAttribute("name", name);
		attr.addFlashAttribute("price", price);
		attr.addFlashAttribute("qty", qty);
		return "redirect:./success";
	}
	
	@RequestMapping("/success")
	public String saveOrder() {
		return "case02/order_ok";
	}
}