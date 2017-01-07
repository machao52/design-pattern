package org.mc.decoratorPattern;

public class ManDecoratorA extends Decorator{
	
	@Override
	public void eat(){
		super.eat();
		reEat();
		System.out.println("ManDecoratorAÀà");
	}
	
	public void reEat(){
		System.out.println("ÔÚ³ÔÒ»¶Ù·¹...");
	}
}
