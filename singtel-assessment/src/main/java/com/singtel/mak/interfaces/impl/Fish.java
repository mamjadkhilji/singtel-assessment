package com.singtel.mak.interfaces.impl;

public class Fish extends Bird{ 

	public Fish() {
		this.swim("Fishes can swim");
	}
	
	public void fishColor(String str) {
		System.out.println(str);
	}
	
	public void fishSize(String str) {
		System.out.println(str);
	}
	
	public void fishProps(String str) {
		System.out.println(str);
	}
	
	public void fishFood(String str) {
		System.out.println(str);
	}
	
	class FishType{
		public Dolphin getDolphin() {
			return new Dolphin();
		}
	}
}
