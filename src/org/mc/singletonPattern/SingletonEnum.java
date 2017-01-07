package org.mc.singletonPattern;


/**
 * ö������(�����Ƽ�����)
 * �����ᵽ������ʵ�ֵ����ķ�ʽ���й�ͬ��ȱ�㣺
 * (1)��Ҫ����Ĺ�����ʵ�����л�������ÿ�η����л�һ�����л��Ķ���ʱ
 *    ���ᴴ��һ���µ�ʵ����
 * (2)����ʹ�÷���ǿ�е���˽�й����������Ҫ������������������޸Ĺ�
 *    �����������ڴ����ڶ���ʵ����ʱ�����쳣����
 * ��ö����ܺõĽ�������������⣬ʹ��ö�ٳ����̰߳�ȫ�ͷ�ֹ����
 * ���ù�����֮�⣬���ṩ���Զ����л����ƣ���ֹ�����л���ʱ�򴴽���
 * �Ķ�����ˣ���Effective Java�������Ƽ�ʹ�õķ�����������
 * ��ʵ�ʹ����У����ٿ���������ôд��
 *  �ô���������㣺1.�̰߳�ȫ 2.������Ϊ���л���������ʵ�� 3.��ֹ���乥��
 */
public enum SingletonEnum {
	 INSTANCE {
	        @Override
	        protected void read() {
	            System.out.println("read");
	        }

	        @Override
	        protected void write() {
	            System.out.println("write");
	        }

	    };
	    protected abstract void read();
	    protected abstract void write();
		
		private String name;
		private int index;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}

}
