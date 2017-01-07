package org.mc.factoryPattern;

public class TestFactory {

	public static void main(String[] args) {
		Factory f=new FactoryImplA();
		f.createCar();
		f.createBread();
	}
	
}
