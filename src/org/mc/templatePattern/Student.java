package org.mc.templatePattern;

public class Student extends AbstractPerson{

	
	
	@Override
	public void dressUp() {
		System.out.println("学生穿衣服...");
	}

	@Override
	public void eatBreakFast() {
		System.out.println("学生快速的吃饭...");
	}

	@Override
	public void takeThings() {
		System.out.println("带上书包去上学...");
	}

}
