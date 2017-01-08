package org.mc.builderPattern;

public class ManBuilder implements Builder{
	
	private Person person;
	
	public ManBuilder(){
		this.person=new Man();
	}

	@Override
	public void buildHead() {
		person.setHead("���˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("���˵�����");
	}

	@Override
	public void buildFoot() {
 		person.setFoot("���˵Ľ�");
	}

	@Override
	public Person returnBuildPerson() {
		return person;
	}

}
