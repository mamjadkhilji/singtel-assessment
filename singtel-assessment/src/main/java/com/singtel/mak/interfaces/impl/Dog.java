package com.singtel.mak.interfaces.impl;

public class Dog extends Bird{ 
	public Dog() {
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
