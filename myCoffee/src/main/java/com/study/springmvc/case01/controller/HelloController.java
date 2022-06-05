package com.study.springmvc.case01.controller;

import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springmvc.case01.entity.User;

@Controller
// Base���|�G/case01/hello
@RequestMapping("/case01/hello")
public class HelloController {
	
	// 1. ���o�r����
	// ���|�G/welcome
	@RequestMapping("/welcome")
	@ResponseBody // �����ھڦ^�ǭȫ��O�^��
	public String welcome() {
		return "Hello SpringMVC " + new Date();
	}
	
	// 2. �a�Ѽ�(?xxx=xxx �t�m @RequestParam)
	// ���|�G/sayhi?name=Vincent&age=18
	@RequestMapping(value={"/sayhi", "/hi"}, method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public String sayhi(@RequestParam(value = "name") String name,
						@RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {
		return String.format("Hi %s %d", name, age);
	}
	
	/*
	 * 3. �a�Ѽ� Lab �m�ߡG?��a�J�Ѽƨíp��
	 * ���|�G/bmi?h=170.0&w=60.0
	 * �i�H�ϥΡGOptional<?> �ӱ��Ѽ�
	 */
	// �г]�p��k api, ���G�|�o�� bmi = 20.76�C�Y��T�����h��� bmi = None!
	@GetMapping("/bmi")
	@ResponseBody
	public String bmi(@RequestParam(value = "h", required = false) Optional<Double> h,
					  @RequestParam(value = "w", required = false) Optional<Double> w) {
			String result = "None";
			if(h.isPresent() && w.isPresent()) {
				double bmi = w.get()/Math.pow(h.get()/100, 2);
				result = String.format("%.2f", bmi);
			}
		return String.format("bmi = %s", result);
	}
	
	/*
	 * 4. ���|�Ѽ� @PathVariable
	 * ���|�G/exam/75 => score: 75 pass
	 * ���|�G/exam/45 => score: 45 fail
	 */
	@GetMapping("/exam/{score}")
	@ResponseBody
	public String examScore(@PathVariable("score") Integer score) {
		return String.format("score: %d %s", score, (score>=60)?"Pass":"Fail");
	}
	
	/*
	 * 5. @RequestParam + @PathVariable (Lab �m��)
	 * ���|�G/calc/add?x=30&y=20  -> Result�G30 + 20 =  50
	 * ���|�G/calc/sub?x=30&y=20  -> Result�G30 - 20 =  10
	 * ���|�G/calc/sub?y=20       -> Result�G 0 - 20 = -20
	 * ���|�G/calc/add            -> Result�G 0 +  0 =   0 
	 * ���|�G/calc/div            -> Result�G exp value error
	 */
	// �г]�p��k api
	@GetMapping("/calc/{exp}")
	@ResponseBody
	public String calcExp(@PathVariable("exp") String exp,
						  @RequestParam(value = "x", required = false, defaultValue = "0") Integer x,
						  @RequestParam(value = "y", required = false, defaultValue = "0") Integer y) {
		int result = 0;
		switch (exp) {
			case "add":
				result = x + y;
				break;
			case "sub":
				result = x - y;
				break;	
			default:
				return "Result: exp value error";
			}
		return String.format("Result: %d %s %d = %d", x, (exp.equals("add"))?"+":"-", y, result);
	}
	
	/*
	 * 6. @PathVariable (�U�Φr���G * ���N�h�r�B? ���N�@�r)
	 * ���|�G/path/namejo/java8
	 * ���|�G/path/nameTaipei/java7
	 * ���|�G/path/name1234/java6
	 */
	@GetMapping("/path/name*/java?")
	@ResponseBody
	public String path() {
		return "Path OK!";
	}
	
	/*
	 * 7. �h���ѼƸ��
	 * �l���|�G/age?age=18&age=19&age=20
	 * �íp�⥭��: avg of age = 19.0
	 */
	@GetMapping("/age")
	@ResponseBody
	public String age(@RequestParam("age") List<Integer> ageList) {
		double avgOfAge = ageList.stream().mapToInt(Integer::intValue).average().getAsDouble();
		return String.format("avg of age = %.1f", avgOfAge);
	}
	
	/* 
	 * 8. �o��h��Java�Ҹզ��Z����� (Lab �m��)
     * ���|�G/javaexam?score=80&score=100&score=50
     * �D�X�̰����B�̧C���B�����P�`�� ==> hight: 100, low: 50, avg: 76.67, sum: 230
    */
	@GetMapping("/javaexam")
	@ResponseBody
	public String javaexam(@RequestParam("score") List<Integer> scores) {
		IntSummaryStatistics stat = scores.stream().mapToInt(Integer::intValue).summaryStatistics();
		return String.format("hight: %d, low: %d, avg: %.2f, sum: %d",
				stat.getMax(), stat.getMin(), stat.getAverage(), stat.getSum());
	}
	
	/*
	 * 9. pojo(entity) 
	 * ���@�� User.java �̭���name�Page�o�G�Ӫ����ݩ�
	 * �l���|�G/user?name=John&age=18
	 * �i�H�i��ѼƦ۰ʤǰt
	 * */
	
	@GetMapping(value = "/user")
	@ResponseBody
	public String getUser(User user) {
		return user.toString();
	}
	
	/*
	 * 10. Map �Ѽ�
	 * ���|�G/person?name=John&score=100&age=18&pass=true
	 * ���|�G/person?name=Mary&score=90&level=2
	 * �`�P��U form ���ǨӪ����Τ@�Ѽ�
	 * */
	@GetMapping(value = "/person")
	@ResponseBody
	//public String getPerson(User user, @RequestParam(value = "score", required = false) Integer score) {
	//	return user.toString() + score;
	//}
	public String getPerson(@RequestParam Map<String, String> person) {
		return person.toString();
	}
	
	/*
	 * 11. ������ HttpSession �����
	 * */
	@GetMapping(value = "/sessionInfo", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String getSessionInfo(HttpSession httpSession) {
		String sessionKey = "firstAccessTime";
		Object time = httpSession.getAttribute(sessionKey);
		if(time == null) {
			time = new Date();
			httpSession.setAttribute(sessionKey, time);
		}
		return String.format("firstAccessTime: %s\nsessionid: %s", time, httpSession.getId());
	}
	
	
	
	
	
	
	
	
	
	
	
}
