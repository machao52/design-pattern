package org.mc.prototypePattern;

public class Head implements Cloneable{
	
	private int size;
	
	private String color;
	
	public Head(int size,String color){
		this.size=size;
		this.color=color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Head clone() throws CloneNotSupportedException{
		return (Head) super.clone();
	}
	

}
