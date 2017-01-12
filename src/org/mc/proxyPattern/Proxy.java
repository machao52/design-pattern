package org.mc.proxyPattern;

public class Proxy implements BuyCar {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public void buy_car() {
		if(person.getVip().equals("vip")){
			person.buy_car();
		}
		if(person.getCash()>=50000){
			System.out.println(person.getUsername()+"付款买了新车...");
		}else{
			System.out.println(person.getUsername()+"资金不足,无法购买新车...");
		}
	}

}
