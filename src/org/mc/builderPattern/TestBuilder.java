package org.mc.builderPattern;


/**
 * Created in 2017/01/08
 * @author machao
 * 建造者模式: 将一个复杂对象的构建与它的表示分离,
 * 使得同样的构建过程可以创建不同的表示.
 */
public class TestBuilder {
	
	public static void main(String[] args) {
		DirectorBuilder db=new DirectorBuilder();
		Person man=db.contractBuilder(new ManBuilder());
		System.out.println(man.getHead()+" "+man.getBody()+" "+man.getFoot());
		Person woman=db.contractBuilder(new WomanBuilder());
		System.out.println(woman.getHead()+" "+woman.getBody()+" "+woman.getFoot());
	}

}
