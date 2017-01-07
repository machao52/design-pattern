package org.mc.singletonPattern;

public class TestSingleton {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//System.out.println(Singleton.getInstance());
		
		SingletonEnum.INSTANCE.read();
		SingletonEnum.INSTANCE.setName("machao");
		System.out.println(SingletonEnum.INSTANCE.getName());
	}

}
