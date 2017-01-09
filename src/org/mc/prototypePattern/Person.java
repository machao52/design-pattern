package org.mc.prototypePattern;

public class Person implements Cloneable{
	
	private int age;
	
	private String name;

	private Head head;
	
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	public Person(Head head){
		this.head=head;
	}
	
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Person clone() throws CloneNotSupportedException{
		Person person=(Person) super.clone();
		person.head=head.clone();
		return person;
	}
	
	

}
