package org.mc.templatePattern;


/**
 * Created in 2017/01/12
 * @author machao
 * �������������̿��
 */
public abstract class AbstractPerson {
	
	public void prepareGotoSchool(){
		dressUp();
		eatBreakFast();
		takeThings();
	}
	
	public abstract void dressUp();
	public abstract void eatBreakFast();
	public abstract void takeThings();
}
