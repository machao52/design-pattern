package org.mc.adapterPattern;


/**
 * @author machao
 * 类适配器
 */
public class Adapeter extends Adaptee implements Target{
	
	/**
	 * 继承特殊功能方法
	 */
	@Override
	public void request() {
		super.specificRequest();
	}

}
