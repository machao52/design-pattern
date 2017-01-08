package org.mc.builderPattern;


/**
 * Created in 2017/01/08
 * @author machao
 * ������ģʽ: ��һ�����Ӷ���Ĺ��������ı�ʾ����,
 * ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ.
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
