package org.mc.factoryPattern;

public class FactoryImplA implements Factory{

	@Override
	public void createCar() {
		Car c=new CarB();
		c.make();
	}

	@Override
	public void createBread() {
		Bread b=new BreadB();
		b.baking();
	}
	

}
