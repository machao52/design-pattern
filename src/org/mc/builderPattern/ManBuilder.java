package org.mc.builderPattern;

public class ManBuilder implements Builder{
	
	private Person person;
	
	public ManBuilder(){
		this.person=new Man();
	}

	@Override
	public void buildHead() {
		person.setHead("男人的头");
	}

	@Override
	public void buildBody() {
		person.setBody("男人的身体");
	}

	@Override
	public void buildFoot() {
 		person.setFoot("男人的脚");
	}

	@Override
	public Person returnBuildPerson() {
		return person;
	}

}
