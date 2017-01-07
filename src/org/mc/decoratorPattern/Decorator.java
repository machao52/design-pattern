package org.mc.decoratorPattern;

public abstract class Decorator implements Person{
	
	protected Person person;
	
	public Person setPerson(Person person){
		return this.person=person;
	}
	
	public void eat(){
		person.eat();
	}

}
