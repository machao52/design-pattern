package org.mc.combination;


/**
 * Created in 2017/01/14
 * @author machao
 * 组合模式:将对象组合成树形结构以表示"部分-整体"的层次结构,组合模式
 * 使得用户对单个对象和组合对象的使用具有一致性.
 * 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合
 * 对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了。
 */
public class TestCombination {
	
	public static void main(String[] args) {
		
		Combination bn0=new BranchNode();
		bn0.name="根节点";
		Combination bn1=new BranchNode();
		bn1.name="左分支节点";
		Combination bn2=new BranchNode();
		bn2.name="右分支节点";
		Combination bn3=new LeafNode();
		bn3.name="左叶节点";
		Combination bn4=new LeafNode();
		bn4.name="右叶节点";
		bn1.add(bn3);
		bn1.add(bn4);
		bn0.add(bn1);
		bn0.add(bn2);
		bn0.eachChild();
	}

	
	
	
	
	
	
	
	
	
}
