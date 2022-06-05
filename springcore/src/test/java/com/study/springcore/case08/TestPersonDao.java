package com.study.springcore.case08;

import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonDao {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext8.xml");
		PersonDao personDao = ctx.getBean("personDaoImpl", PersonDaoImpl.class);
		
		System.out.println(personDao.readAll());//查詢全部資料
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		boolean check = personDao.create(new Person("Mary", 0, sdf.parse("2010/1/1")));//新增資料
		System.out.println(check);//檢查是否有新增
		
		System.out.println(personDao.readAll());//再次查詢全部資料
	}

}
