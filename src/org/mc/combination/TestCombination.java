package org.mc.combination;


/**
 * Created in 2017/01/14
 * @author machao
 * ���ģʽ:��������ϳ����νṹ�Ա�ʾ"����-����"�Ĳ�νṹ,���ģʽ
 * ʹ���û��Ե����������϶����ʹ�þ���һ����.
 * �����������������ֲ����������νṹʱ���Լ���ϣ���û����Ժ������
 * �����뵥������Ĳ�ͬ��ͳһ��ʹ����Ͻṹ�е����ж���ʱ����Ӧ�ÿ������ģʽ�ˡ�
 */
public class TestCombination {
	
	public static void main(String[] args) {
		
		Combination bn0=new BranchNode();
		bn0.name="���ڵ�";
		Combination bn1=new BranchNode();
		bn1.name="���֧�ڵ�";
		Combination bn2=new BranchNode();
		bn2.name="�ҷ�֧�ڵ�";
		Combination bn3=new LeafNode();
		bn3.name="��Ҷ�ڵ�";
		Combination bn4=new LeafNode();
		bn4.name="��Ҷ�ڵ�";
		bn1.add(bn3);
		bn1.add(bn4);
		bn0.add(bn1);
		bn0.add(bn2);
		bn0.eachChild();
	}

	
	
	
	
	
	
	
	
	
}
