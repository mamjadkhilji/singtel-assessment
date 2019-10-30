package com.singtel.mak.interfaces.impl;

public class Chicken extends Bird { 
	
	private String chickenType;
	
	public Chicken() {
			this.sing("A chicken says: \"Cluck, cluck\"");
	}
	
	//START - Access ROOSTER object without inheritance.
	public Object getChickenObject() {
		if(this.chickenType.equalsIgnoreCase("ROOSTER")) {
			return new Rooster();
		}
		return this;
	}

	public void setChickenType(String chickenType) {
		this.chickenType = chickenType;
	}
	// END - Access ROOSTER object without inheritance.


	class RoosterInner{
		public Rooster getRooster() {
			return new Rooster();
		}
	}
}
