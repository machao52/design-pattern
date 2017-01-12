package org.mc.proxyPattern;

public class Person implements BuyCar {

	private int cash;

	private String vip;

	private String username;

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void buy_car() {
         System.out.println(username+"是VIP客户,可以直接购买新车");
	}

}
