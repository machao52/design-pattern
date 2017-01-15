package org.mc.combination;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Combination{
    
	List<Combination> list=new ArrayList<Combination>();
	
	@Override
	public void add(Combination combination) {
		list.add(combination);
	}

	@Override
	public void remove(Combination combination) {
		list.remove(combination);
	}

	@Override
	public void eachChild() {
		System.out.println(name+"÷¥––¡À...");
		for(Combination combination:list){
			combination.eachChild();
		}
	}
	
	

}
