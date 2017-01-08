package org.mc.builderPattern;

public class DirectorBuilder {
	
	public Person contractBuilder(Builder builder){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.returnBuildPerson();
	}

}
