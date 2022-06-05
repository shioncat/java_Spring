package com.study.springcore.aop_lab;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class Introducter { // 經紀人
	// 將 Performance 及其子類別轉換為 Singer
/*	@DeclareParents(value = "com.study.springcore.aop_lab.Performance+",
					defaultImpl = BackSinger.class)
	public Singer singer;
*/	
	// 將Performance及子類別轉換為Aator
	@DeclareParents(value = "com.study.springcore.aop_lab.Performance+",
					defaultImpl = TalkActor.class)
	public Actor show;
}
