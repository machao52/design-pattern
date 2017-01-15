package org.mc.decoratorPattern;

public class ManDecoratorA extends Decorator{
	
	@Override
	public void eat(){
		super.eat();
		reEat();
	}
	
	public void reEat(){
		System.out.println("‘Ÿ≥‘“ª∂Ÿ∑π...");
	}
}
