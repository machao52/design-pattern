package org.mc.bridge;

public class SpeedWay extends AbstractRoad{
	
	@Override
	public void run(){
		super.run();
		aCar.run();
		System.out.println("�ڸ��ٹ�·����ʻ...");
	}

}
