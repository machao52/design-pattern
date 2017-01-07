package org.mc.decoratorPattern;

public class ManDecoratorB extends Decorator{
	
	@Override
	public void eat(){
		super.eat();
		payEat();
	}
	
	public void payEat(){
		System.out.println("ManDecoratorB³Ô·¹¸¶Ç®!");
	}
}
