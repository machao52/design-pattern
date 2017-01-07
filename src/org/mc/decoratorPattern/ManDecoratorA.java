package org.mc.decoratorPattern;

public class ManDecoratorA extends Decorator{
	
	@Override
	public void eat(){
		super.eat();
		reEat();
		System.out.println("ManDecoratorA��");
	}
	
	public void reEat(){
		System.out.println("�ڳ�һ�ٷ�...");
	}
}
