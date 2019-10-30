package com.singtel.mak.interfaces.impl;

public class Butterfly extends Bird{  
	
	public Butterfly() {
		this.fly("A butterfly can fly.");
	}

	class Caterpillar extends Bird{
		public Caterpillar() {
			this.walk("A caterpillar can walk (crawl)");
		}
	}
}
