package org.mc.singletonPattern;

public class TestSingleton {
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Singleton.newInstance());
		System.out.println(SingletonEnum.instance);
	}

}
