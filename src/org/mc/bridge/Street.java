package org.mc.bridge;

public class Street extends AbstractRoad{
	
	@Override
	public void run(){
		super.run();
		aCar.run();
		System.out.println("�ڽֵ�����ʻ...");
	}

}
