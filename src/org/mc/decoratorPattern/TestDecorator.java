package org.mc.decoratorPattern;

/**
 * Creted in 2017/01/06
 * @author machao
 * 1.װ����ģʽ:��̬�ĸ��������һЩ���������.�����ӹ�����˵,װ����ģʽ
 *   ������������Ϊ���.��ģʽ�Կͻ���͸���ķ�ʽ��չ����Ĺ���.
 * 2.���û���:
 *  (1)�ڲ�Ӱ����������������,�Զ�̬,͸���ķ�ʽ���������ְ��.
 *  (2)������Щ���Գ����Ķ���.
 *  (3)�����ܲ�����������ķ�������ʱ.һ�������,�����д�����������չ,Ϊ
 *  ֧��ÿһ����ϲ�������������,ʹ��������Ŀ�ʱ�ըʽ����.��һ������ǿ���
 *  ��Ϊ�ඨ�屻����,���ඨ�岻��������������.
 * 3.������:
 * (1)Component����װ�ζ���Ļ��ࣩ
 * ����һ������ӿڣ����Ը���Щ����̬�����ְ��
 * (2)ConcreteComponent�����屻װ�ζ���
 * ����һ�����󣬿��Ը�����������һЩְ��
 * (3)Decorator��װ���߳����ࣩ
 * ά��һ��ָ��Componentʵ�������ã�������һ����Component�ӿ�һ�µĽӿڡ�
 * (4)ConcreteDecorator������װ���ߣ�
 * �����װ�ζ��󣬸��ڲ����еľ��屻װ�ζ������Ӿ����ְ��
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
