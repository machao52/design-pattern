package org.mc.proxyPattern;


/**
 * Created in 2017/01/12
 * @author machao
 * ����ģʽ:��һЩ�����ṩ����,��������Щ����ȥ������������.
 */
public class TestProxy {
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setUsername("����");
		p1.setVip("vip");
		p1.setCash(60000);
		Person p2=new Person();
		p2.setUsername("����");
		p2.setVip("vip1");
		p2.setCash(80000);
		Person p3=new Person();
		p3.setUsername("����");
		p3.setVip("vip122");
		p3.setCash(500);
		
		Proxy proxy1=new Proxy();
		proxy1.setPerson(p1);
		proxy1.buy_car();
		
		Proxy proxy2=new Proxy();
		proxy2.setPerson(p2);
		proxy2.buy_car();
		
		Proxy proxy3=new Proxy();
		proxy3.setPerson(p3);
		proxy3.buy_car();
	}

}
