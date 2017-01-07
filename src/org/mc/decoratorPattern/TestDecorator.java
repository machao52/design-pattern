package org.mc.decoratorPattern;

/**
 * Creted in 2017/01/06
 * @author machao
 * 1.装饰者模式:动态的给对象添加一些额外的责任.就增加功能来说,装饰者模式
 *   相比生成子类更为灵活.该模式对客户端透明的方式扩展对象的功能.
 * 2.适用环境:
 *  (1)在不影响其他对象的情况下,以动态,透明的方式给对象添加职责.
 *  (2)处理那些可以撤销的对象.
 *  (3)当不能采用生成子类的方法扩充时.一种情况是,可能有大量独立的扩展,为
 *  支持每一种组合产生大量的子类,使得子类数目呈爆炸式增长.另一种情况是可能
 *  因为类定义被隐藏,或类定义不能用于生成子类.
 * 3.参与者:
 * (1)Component（被装饰对象的基类）
 * 定义一个对象接口，可以给这些对象动态地添加职责。
 * (2)ConcreteComponent（具体被装饰对象）
 * 定义一个对象，可以给这个对象添加一些职责。
 * (3)Decorator（装饰者抽象类）
 * 维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
 * (4)ConcreteDecorator（具体装饰者）
 * 具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
 */
public class TestDecorator {
	
	public static void main(String[] args) {
		Man m=new Man();
		ManDecoratorA ma=new ManDecoratorA();
		ManDecoratorB mb=new ManDecoratorB();
		ma.setPerson(m);
		mb.setPerson(ma);
		mb.eat();
	}

}
