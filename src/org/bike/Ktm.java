package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("the cost is high ");
		
	}

	@Override
	public void speed() {
		System.out.println("the speed is good");
		
	}
	private void RoyalEnfield() {
		System.out.println("Classic users");

	}
public static void main(String[] args) {
	Ktm a = new Ktm ();
	a.speed();
	a.cost();
	
	a.RoyalEnfield();
	
}
}
