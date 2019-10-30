package com.singtel.mak.interfaces.impl;

public class Rooster extends Bird{  
	
	private String roosterLanguage;
	public Rooster() {
		this.roosterLanguage = "English";
		getRoosterProperties();
	}
	
	public Rooster(String roosterLanguage) {
		this.roosterLanguage = roosterLanguage;
		getRoosterProperties();
	}
	
	public void getRoosterProperties() {
		switch(this.roosterLanguage) {
			case "Danish": this.sing("Danish: kykyliky"); break;
			case "Dutch":  this.sing("Dutch: kukeleku"); break;
			case "Finnish": this.sing("Finnish: kukko kiekuu"); break;
			case "French": this.sing("French: cocorico"); break;
			case "German": this.sing("German: kikeriki"); break;
			case "Greek": this.sing("Greek: kikiriki"); break;
			case "Hebrew": this.sing("Hebrew: coo-koo-ri-koo"); break;
			case "Hungarian": this.sing("Hungarian: kukuriku"); break;
			case "Italian": this.sing("Italian: chicchirichi"); break;
			case "Japanese": this.sing("Japanese: ko-ke-kok-ko-o"); break;
			case "Portuguese": this.sing("Portuguese: cucurucu"); break;
			case "Russian": this.sing("Russian: kukareku"); break;
			case "Swedish": this.sing("Swedish: kuckeliku"); break;
			case "Turkish": this.sing("Turkish: kuk-kurri-kuuu"); break;
			case "Urdu": this.sing("Urdu: kuklooku"); break;
			default : this.sing("A rooster says: \"Cock-a-doodle-doo\"");
			
		}	
		
	}
	
	class ParrotInner{
		public Parrot getParrot() {
			Parrot roosterParrot = new Parrot();
			roosterParrot.sing("A parrot living near the rooster says: \"Cock-a-doodle-doo\"");
			return roosterParrot;
		}
	}
}
