package com.singtel.mak.interfaces.impl;

public class Frog extends Bird{ 
	public Frog() {
		this.walk("A Dog can walk.");
	}
	
	class ParrotInner{
		public Parrot getParrot() {
			Parrot dogParrot = new Parrot();
			dogParrot.sing("A parrot living with dogs says: \"Woof, woof\"");
			return dogParrot;
		}
	}
}
