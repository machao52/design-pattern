package org.mc.adapterPattern;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("普通类具有普通功能...");
	}

}
