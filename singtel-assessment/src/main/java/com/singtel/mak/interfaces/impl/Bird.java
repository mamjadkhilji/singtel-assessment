package com.singtel.mak.interfaces.impl;

import com.singtel.mak.interfaces.Animal;

public class Bird implements Animal{ 

	private String walkBehavior;
	private String flyBehavior;
	private String singBehavior;
	private String swimBehavior;
	
	
	@Override
	public void walk(String behavior) {
		System.out.println(behavior);
		this.walkBehavior = behavior;
		
	}

	@Override
	public void fly(String behavior) {
		System.out.println(behavior);
		this.flyBehavior =  behavior;		
	}

	@Override
	public void sing(String behavior) {
		System.out.println(behavior);
		this.singBehavior =   behavior;
		
	}

	@Override
	public void swim(String behavior) {
		System.out.println(behavior);
		this.swimBehavior =  behavior;
		
	}

	@Override
	public String getWalkBehavior() {
		return walkBehavior;
	}

	@Override
	public String getFlyBehavior() {
		return flyBehavior;
	}

	@Override
	public String getSingBehavior() {
		return singBehavior;
	}

	@Override
	public String getSwimBehavior() {
		return swimBehavior;
	}

}
