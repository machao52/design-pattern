package org.mc.prototypePattern;


/**
 * Created in 2017/01/09
 * @author machao
 * ԭ��ģʽ: ��ԭ��ʵ��ָ���������������,��ͨ��������Щԭ��
 * �����µĶ���.
 * ʹ��ԭ��ģʽ���������ֱ��newһ��������������Ҫ�õĶ࣬
 * ��ΪObject���clone������һ�����ط�������ֱ�Ӳ����ڴ��еĶ���������
 * �ر��Ǹ��ƴ����ʱ�����ܵĲ��ǳ����ԡ�
 * ʹ��ԭ��ģʽ����һ���ô��Ǽ򻯶���Ĵ�����ʹ�ô�������
 * ���������ڱ༭�ĵ�ʱ�ĸ���ճ��һ���򵥡�
 * ��Ϊ�����ŵ㣬��������Ҫ�ظ��ش������ƶ���ʱ���Կ���ʹ��ԭ��ģʽ��
 * ������Ҫ��һ��ѭ�����ڴ������󣬼�����󴴽����̱Ƚϸ��ӻ���ѭ����
 * ���ܶ�Ļ���ʹ��ԭ��ģʽ�������Լ򻯴������̣����ҿ���ʹϵͳ������������ߺܶࡣ
 */
public class TestPrototype {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//ǳ����
		ConcretePrototype cp=new ConcretePrototype();
		for(int i=0;i<10;i++){
			ConcretePrototype cpclone=(ConcretePrototype) cp.clone();
			cpclone.show();
		}
		
		//���
		Person p=new Person(new Head(22,"yellow"));
		Person p1=p.clone();
		System.out.println(p.getHead());
		System.out.println(p1.getHead());
	}

}
