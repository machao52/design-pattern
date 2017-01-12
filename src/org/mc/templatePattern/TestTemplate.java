package org.mc.templatePattern;


/**
 * Created in 2017/01/12
 * @author machao
 * ģ�巽��ģʽ: �������Ϊģʽ.
 * ׼��һ��������,�������߼��Ծ���ķ����Լ����幹�캯������ʽ����,
 * Ȼ������һЩ���󷽷�����ʹ����ʵ��ʣ����߼�.��ͬ����������Բ�
 * ͬ�ķ�ʽʵ����Щ���󷽷�,�Ӷ���ʣ����߼��в�ͬ��ʵ��.
 * ģʽ�еĽ�ɫ:
 * ������:ʵ����ģ�巽��,�������㷨�ĹǼ�.
 * ������:ʵ�ֳ������еĳ��󷽷�,������������㷨.
 * �ŵ�:
 * (1)ģ�巽��ģʽͨ���Ѳ������Ϊ���Ƶ�����,ȥ���������е��ظ�����.
 * (2)����ʵ���㷨��ĳЩϸ��,�������㷨����չ
 * (3)ͨ��һ�������������ʵ�ֵĲ���,ͨ��������չ���ӵ���Ϊ,����
 * "����-���ԭ��".
 */
public class TestTemplate {
	
	public static void main(String[] args) {
		
		AbstractPerson student=new Student();
		AbstractPerson teacher=new Teacher();
		student.prepareGotoSchool();
		teacher.prepareGotoSchool();
	}

}
