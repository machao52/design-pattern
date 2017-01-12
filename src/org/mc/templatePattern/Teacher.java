package org.mc.templatePattern;

public class Teacher extends AbstractPerson{

	@Override
	public void dressUp() {
		System.out.println("老师穿衣服...");
	}

	@Override
	public void eatBreakFast() {
		System.out.println("老师给孩子做饭...");
	}

	@Override
	public void takeThings() {
		System.out.println("老师带上自己的教案去上班...");
	}

}
