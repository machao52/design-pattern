package org.mc.combination;

public abstract class Combination {
	
	String name;
	
	public abstract void add(Combination combination);
	public abstract void remove(Combination combination);
	public abstract void eachChild();

}
