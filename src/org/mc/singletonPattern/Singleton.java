package org.mc.singletonPattern;


/**
 * Created in 2017/01/07
 * @author machao
 * 单例模式: 确保一个类只有一个实例,并提供一个全局访问点.
 */
public class Singleton {
	
	/**
	 * 饿汉模式
	 * 从代码中我们看到，类的构造函数定义为private的，保证其他类不能实例化此类，
	 * 然后提供了一个静态实例并返回给调用者。饿汉模式是最简单的一种实现方式，饿汉
	 * 模式在类加载的时候就对实例进行创建，实例在整个程序周期都存在。它的好处是只
	 * 在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，避免了多线
	 * 程同步的问题。它的缺点也很明显，即使这个单例没有用到也会被创建，而且在类加
	 * 载之后就被创建，内存就被浪费了。
     * 这种实现方式适合单例占用内存比较小，在初始化时就会被用到的情况。但是，如果
     * 单例占用的内存比较大，或单例只是在某个特定场景下才会用到，使用饿汉模式就不
     * 合适了，这时候就需要用到懒汉模式进行延迟加载。
	 */
	/*private static Singleton instance=new Singleton();
	private Singleton(){
		
	}
    public static Singleton getInstance(){
    	return instance;
    }*/
	
	/**
	 * 饿汉模式变种
	 * 与上面一种没实质上的区别
	 */
    /*private static Singleton instance=null;
    static{
    	instance=new Singleton();
    }
    private Singleton(){
    	
    }
    public static Singleton getInstance(){
    	return instance;
    }*/
    
	/**
	 * 懒汉模式
	 * 懒汉模式中单例是在需要的时候才去创建的，如果单例已经创建，再次调用
	 * 获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。如果某
	 * 个单例使用的次数少，并且创建单例消耗的资源较多，那么就需要实现单例
	 * 的按需创建，这个时候使用懒汉模式就是一个不错的选择。但是这里的懒汉
	 * 模式并没有考虑线程安全问题，在多个线程可能会并发调用它的
	 * getInstance()方法，导致创建多个实例，因此需要加锁解决线程同步问题.
	 */
	/*private static Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}*/
	
	/**
	 * 懒汉模式加锁版(解决线程同步)
	 */
    /*private static Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}*/
	
	/**
	 * 懒汉模式加锁(优化)版
	 */
    /*private static Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}*/
	/**
	 * 懒汉模式加锁(终极)版-双重校验锁
	 * 我们看到双重校验锁即实现了延迟加载，又解决了线程并发问题，同时还解
	 * 决了执行效率问题，是否真的就万无一失了呢？ 这里要提到Java中的指令
	 * 重排优化。所谓指令重排优化是指在不改变原语义的情况下，通过调整指令
	 * 的执行顺序让程序运行的更快。JVM中并没有规定编译器优化相关的内容，
	 * 也就是说JVM可以自由的进行指令重排序的优化。
     *这个问题的关键就在于由于指令重排优化的存在，导致初始化Singleton
     *和将对象地址赋给instance字段的顺序是不确定的。在某个线程创建单例
     *对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段
     *设置为默认值。此时就可以将分配的内存地址赋值给instance字段了，然而
     *该对象可能还没有初始化。若紧接着另外一个线程来调用getInstance，
     *取到的就是状态不正确的对象，程序就会出错。以上就是双重校验锁会失效的原因，
     *不过还好在JDK1.5及之后版本增加了volatile关键字。volatile的一个语义
     *是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初
     *始化过的，从而避免了上面说到的问题。
	 */
    /*private static volatile Singleton instance=null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class) {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}*/
	
	/**
	 * 静态内部类
	 * 这种方式同样利用了类加载机制来保证只创建一个instance实例。它与饿汉
	 * 模式一样，也是利用了类加载机制，因此不存在多线程并发的问题。不一样的是，
	 * 它是在内部类里面去创建对象实例。这样的话，只要应用中不使用内部类，JVM
	 * 就不会去加载这个单例类，也就不会创建单例对象，从而实现懒汉式的延迟加载。
	 * 也就是说这种方式可以同时保证延迟加载和线程安全。
	 */
	private static class SingletonHolder{
		private static Singleton instance=new Singleton();
	}
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return SingletonHolder.instance;
	}
    
	
}
