package org.mc.builderPattern;

public interface Builder {
	
	public void buildHead();
	
	public void buildBody();
	
	public void buildFoot();
	
	public Person returnBuildPerson();

}
