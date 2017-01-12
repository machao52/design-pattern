package org.mc.singletonPattern;


/**
 * Created in 2017/01/07
 * @author machao
 * ����ģʽ: ȷ��һ����ֻ��һ��ʵ��,���ṩһ��ȫ�ַ��ʵ�.
 */
public class Singleton {
	
	/**
	 * ����ģʽ
	 * �Ӵ��������ǿ�������Ĺ��캯������Ϊprivate�ģ���֤�����಻��ʵ�������࣬
	 * Ȼ���ṩ��һ����̬ʵ�������ظ������ߡ�����ģʽ����򵥵�һ��ʵ�ַ�ʽ������
	 * ģʽ������ص�ʱ��Ͷ�ʵ�����д�����ʵ���������������ڶ����ڡ����ĺô���ֻ
	 * ������ص�ʱ�򴴽�һ��ʵ����������ڶ���̴߳������ʵ��������������˶���
	 * ��ͬ�������⡣����ȱ��Ҳ�����ԣ���ʹ�������û���õ�Ҳ�ᱻ���������������
	 * ��֮��ͱ��������ڴ�ͱ��˷��ˡ�
     * ����ʵ�ַ�ʽ�ʺϵ���ռ���ڴ�Ƚ�С���ڳ�ʼ��ʱ�ͻᱻ�õ�����������ǣ����
     * ����ռ�õ��ڴ�Ƚϴ󣬻���ֻ����ĳ���ض������²Ż��õ���ʹ�ö���ģʽ�Ͳ�
     * �����ˣ���ʱ�����Ҫ�õ�����ģʽ�����ӳټ��ء�
	 */
	/*private static Singleton instance=new Singleton();
	private Singleton(){
		
	}
    public static Singleton getInstance(){
    	return instance;
    }*/
	
	/**
	 * ����ģʽ����
	 * ������һ��ûʵ���ϵ�����
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
	 * ����ģʽ
	 * ����ģʽ�е���������Ҫ��ʱ���ȥ�����ģ���������Ѿ��������ٴε���
	 * ��ȡ�ӿڽ��������´����µĶ��󣬶���ֱ�ӷ���֮ǰ�����Ķ������ĳ
	 * ������ʹ�õĴ����٣����Ҵ����������ĵ���Դ�϶࣬��ô����Ҫʵ�ֵ���
	 * �İ��贴�������ʱ��ʹ������ģʽ����һ�������ѡ�񡣵������������
	 * ģʽ��û�п����̰߳�ȫ���⣬�ڶ���߳̿��ܻᲢ����������
	 * getInstance()���������´������ʵ���������Ҫ��������߳�ͬ������.
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
	 * ����ģʽ������(����߳�ͬ��)
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
	 * ����ģʽ����(�Ż�)��
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
	 * ����ģʽ����(�ռ�)��-˫��У����
	 * ���ǿ���˫��У������ʵ�����ӳټ��أ��ֽ�����̲߳������⣬ͬʱ����
	 * ����ִ��Ч�����⣬�Ƿ���ľ�����һʧ���أ� ����Ҫ�ᵽJava�е�ָ��
	 * �����Ż�����νָ�������Ż���ָ�ڲ��ı�ԭ���������£�ͨ������ָ��
	 * ��ִ��˳���ó������еĸ��졣JVM�в�û�й涨�������Ż���ص����ݣ�
	 * Ҳ����˵JVM�������ɵĽ���ָ����������Ż���
     *�������Ĺؼ�����������ָ�������Ż��Ĵ��ڣ����³�ʼ��Singleton
     *�ͽ������ַ����instance�ֶε�˳���ǲ�ȷ���ġ���ĳ���̴߳�������
     *����ʱ���ڹ��췽��������֮ǰ����Ϊ�ö���������ڴ�ռ䲢��������ֶ�
     *����ΪĬ��ֵ����ʱ�Ϳ��Խ�������ڴ��ַ��ֵ��instance�ֶ��ˣ�Ȼ��
     *�ö�����ܻ�û�г�ʼ����������������һ���߳�������getInstance��
     *ȡ���ľ���״̬����ȷ�Ķ��󣬳���ͻ�������Ͼ���˫��У������ʧЧ��ԭ��
     *����������JDK1.5��֮��汾������volatile�ؼ��֡�volatile��һ������
     *�ǽ�ָֹ���������Ż���Ҳ�ͱ�֤��instance��������ֵ��ʱ������Ѿ��ǳ�
     *ʼ�����ģ��Ӷ�����������˵�������⡣
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
	 * ��̬�ڲ���
	 * ���ַ�ʽͬ������������ػ�������ֻ֤����һ��instanceʵ�����������
	 * ģʽһ����Ҳ������������ػ��ƣ���˲����ڶ��̲߳��������⡣��һ�����ǣ�
	 * �������ڲ�������ȥ��������ʵ���������Ļ���ֻҪӦ���в�ʹ���ڲ��࣬JVM
	 * �Ͳ���ȥ������������࣬Ҳ�Ͳ��ᴴ���������󣬴Ӷ�ʵ������ʽ���ӳټ��ء�
	 * Ҳ����˵���ַ�ʽ����ͬʱ��֤�ӳټ��غ��̰߳�ȫ��
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
