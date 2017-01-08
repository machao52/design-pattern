package org.mc.builderPattern;

public class WomanBuilder implements Builder{

    private Person person;
	
    public WomanBuilder(){
		this.person=new Woman();
	}

	@Override
	public void buildHead() {
		person.setHead("女人的头");
	}

	@Override
	public void buildBody() {
		person.setBody("女人的身体");
	}

	@Override
	public void buildFoot() {
 		person.setFoot("女人的脚");
	}

	@Override
	public Person returnBuildPerson() {
		return person;
	}

}
