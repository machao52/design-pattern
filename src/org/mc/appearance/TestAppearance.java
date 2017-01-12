package org.mc.appearance;


/**
 * Created in 2017/01/12
 * @author machao
 * 外观模式:为子系统的一组接口提供一个一致的界面,定义一个高层接口,这个
 * 接口使得这一子系统更加容易使用.
 * 模式中的角色:
 * 门面角色:客户端可以调用这个角色的方法.
 * 子系统角色:可以同时有一个或多个子系统.
 * 优点:门面模式松散了客户端和子系统的耦合关系,让子系统内部的模块能更
 * 容易扩展和维护.
 */
public class TestAppearance {
	
	public static void main(String[] args) {
		Facade f=new Facade();
		f.test();
	}

}
