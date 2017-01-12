package org.mc.adapterPattern;


/**
 * Created in 2017/01/11
 * @author machao
 * 适配器模式: 将一个类的接口适配成客户希望的另一个接口.
 * 适配器模式使得原本由于接口不兼容而不能一起工作的类可以
 * 在一起工作.
 * 模式中的角色:
 * (1)目标接口(Target):客户所期待的接口.目标可以是具体的或者抽象的类,也可以是接口.
 * (2)需要适配的类(Adaptee):需要适配的类或者适配者类.
 * (3)适配器(Adapter):通过包装一个需要适配的对象,把原接口转换成目标接口.
 * 实现方式:
 * (1)类的适配器模式(采用继承实现)
 * (2)对象适配器(采用对象组合方式实现)
 * 优点:
 * (1)通过适配器,客户端可以调用同一接口,因而对客户端来说是透明的.这样做更简单,更直接,更紧凑.
 * (2)复用了现存的类,解决了现存类和复用环境要求不一致的问题.
 * (3)将目标类和适配者类解耦,通过引入一个适配器类重用现有的适配者类,而无需修改原有代码.
 * (4)一个对象适配器可以把多个不同的适配者类是配到同一个目标,也就是说,同一个适配器可以把适配者类
 * 和它的子类都适配到目标接口.
 */
public class TestAdapeter {
	
	public static void main(String[] args) {
		//类适配器模式
		Target t1=new ConcreteTarget();
		t1.request();
		Target t2=new Adapeter();
		t2.request();
		//对象适配器模式
		Target t3=new AdapterObject(new Adapeter());
		t3.request();
	}

}
