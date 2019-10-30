package com.singtel.mak.interfaces.impl;

public class Cat extends Bird{ 
	public Cat() {
		this.walk("A Cat can walk.");
	}
	
	class ParrotInner{
		public Parrot getParrot() {
			Parrot catParrot = new Parrot();
			catParrot.sing("A parrot living with cats says: \"Meow\"");
			return catParrot;
		}
	}
}
