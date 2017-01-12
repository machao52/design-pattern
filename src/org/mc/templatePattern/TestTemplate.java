package org.mc.templatePattern;


/**
 * Created in 2017/01/12
 * @author machao
 * 模板方法模式: 是类的行为模式.
 * 准备一个抽象类,将部分逻辑以具体的方法以及具体构造函数的形式出现,
 * 然后声明一些抽象方法来迫使子类实现剩余的逻辑.不同的子类可以以不
 * 同的方式实现这些抽象方法,从而对剩余的逻辑有不同的实现.
 * 模式中的角色:
 * 抽象类:实现了模板方法,定义了算法的骨架.
 * 具体类:实现抽象类中的抽象方法,已完成完整的算法.
 * 优点:
 * (1)模板方法模式通过把不变的行为搬移到超类,去除了子类中的重复代码.
 * (2)子类实现算法的某些细节,有利于算法的扩展
 * (3)通过一个父类调用子类实现的操作,通过子类扩展增加的行为,符合
 * "开放-封闭原则".
 */
public class TestTemplate {
	
	public static void main(String[] args) {
		
		AbstractPerson student=new Student();
		AbstractPerson teacher=new Teacher();
		student.prepareGotoSchool();
		teacher.prepareGotoSchool();
	}

}
