package org.mc.prototypePattern;


/**
 * Created in 2017/01/09
 * @author machao
 * 原型模式: 用原型实例指定创建对象的种类,并通过拷贝这些原型
 * 创建新的对象.
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，
 * 因为Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，
 * 特别是复制大对象时，性能的差别非常明显。
 * 使用原型模式的另一个好处是简化对象的创建，使得创建对象
 * 就像我们在编辑文档时的复制粘贴一样简单。
 * 因为以上优点，所以在需要重复地创建相似对象时可以考虑使用原型模式。
 * 比如需要在一个循环体内创建对象，假如对象创建过程比较复杂或者循环次
 * 数很多的话，使用原型模式不但可以简化创建过程，而且可以使系统的整体性能提高很多。
 */
public class TestPrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//浅拷贝
		ConcretePrototype cp=new ConcretePrototype();
		for(int i=0;i<10;i++){
			ConcretePrototype cpclone=(ConcretePrototype) cp.clone();
			cpclone.show();
		}
		
		//深拷贝
		Person p=new Person(new Head(22,"yellow"));
		Person p1=p.clone();
		System.out.println(p.getHead());
		System.out.println(p1.getHead());
	}

}
