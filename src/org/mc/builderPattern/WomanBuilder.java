package org.mc.builderPattern;

public class WomanBuilder implements Builder{

    private Person person;
	
    public WomanBuilder(){
		this.person=new Woman();
	}

	@Override
	public void buildHead() {
		person.setHead("Ů�˵�ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("Ů�˵�����");
	}

	@Override
	public void buildFoot() {
 		person.setFoot("Ů�˵Ľ�");
	}

	@Override
	public Person returnBuildPerson() {
		return person;
	}

}
