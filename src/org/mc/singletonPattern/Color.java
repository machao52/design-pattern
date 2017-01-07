package org.mc.singletonPattern;


public enum Color {
	
	RED("ºìÉ«",1),GREEN("ÂÌÉ«",2);
	
	private String name;
	private int index;
	
	private Color(String name,int index){
		this.name=name;
		this.index=index;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public static void main(String[] args) {
		String color=Color.RED.getName();
		System.out.println(color);
		Color [] c=Color.values();
		for(int i=0;i<c.length;i++){
			System.out.println(c[i].getName()+c[i].getIndex());
		}
	}

}
