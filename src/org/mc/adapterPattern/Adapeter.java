package org.mc.adapterPattern;


/**
 * @author machao
 * ��������
 */
public class Adapeter extends Adaptee implements Target{
	
	/**
	 * �̳����⹦�ܷ���
	 */
	@Override
	public void request() {
		super.specificRequest();
	}

}
