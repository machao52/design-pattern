package org.mc.factoryPattern;


/**
 * Created in 2017/01/08
 * @author machao
 * 工厂模式:为创建对象提供过渡接口,以便将创建对象的具体过程屏蔽
 * 隔离起来,达到提供灵活性的目的.
 * 工厂模式分为三类:
 * 1.简单工厂模式:又称为(静态工厂模式),是由一个具体的类去创建其他类的实例,
 * 父类是相同的,父类是具体的.
 * 2.工厂方法模式:是有一个抽象的父类定义公共接口,子类负责生成具体的对象,这
 * 样做的目的是将类的实例化操作延迟到子类中进行.
 * 3.抽象工厂模式:提供一个创建一系列相关的或相互依赖对象的接口,而无须指定他
 * 们具体的类.它针对的是有多个产品的等级结构.而工厂方法模式针对的是一个产品
 * 的等级结构.
 */
public class TestFactory {

	public static void main(String[] args) {
		Factory f=new FactoryImplA();
		f.createCar();
		f.createBread();
	}
	
}
