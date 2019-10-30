package com.singtel.mak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.mak.dto.AnimalInfo;
import com.singtel.mak.interfaces.Animal;
import com.singtel.mak.interfaces.impl.Bird;
import com.singtel.mak.interfaces.impl.Butterfly;
import com.singtel.mak.interfaces.impl.Cat;
import com.singtel.mak.interfaces.impl.Chicken;
import com.singtel.mak.interfaces.impl.Clownfish;
import com.singtel.mak.interfaces.impl.Dog;
import com.singtel.mak.interfaces.impl.Dolphin;
import com.singtel.mak.interfaces.impl.Duck;
import com.singtel.mak.interfaces.impl.Fish;
import com.singtel.mak.interfaces.impl.Frog;
import com.singtel.mak.interfaces.impl.Parrot;
import com.singtel.mak.interfaces.impl.Rooster;
import com.singtel.mak.interfaces.impl.Sharks;

@RestController
@RequestMapping("/singtelassess")
public class AnimalRestController { 

	@RequestMapping(path="/animaldetails", produces = {"application/json"})
	public AnimalInfo getAnimalDetails(@RequestParam(value="animaltype") String animalType) {
		AnimalInfo animalInfo = new AnimalInfo();
		Animal animalDetails = getAnimalObject(animalType);
		
		animalInfo.setAnimalWalk(animalDetails.getWalkBehavior()!=null?animalDetails.getWalkBehavior():"This animal type("+animalType+") is not able to walk.");
		animalInfo.setAnimalFly(animalDetails.getFlyBehavior()!=null?animalDetails.getFlyBehavior():"This animal type("+animalType+") is not able to fly.");
		animalInfo.setAnimalSong(animalDetails.getSingBehavior()!=null?animalDetails.getSingBehavior():"This animal type("+animalType+") is not able to sing.");
		animalInfo.setAnimalSwim(animalDetails.getSwimBehavior()!=null?animalDetails.getSwimBehavior():"This animal type("+animalType+") is not able to swim.");
		animalInfo.setAnimalType(animalType);
		
		return animalInfo;		
	}
	

	private Animal getAnimalObject(String animalType) {
		Animal animal = null;
		switch(animalType) {
		case "Bird":
		case "bird" : animal = new Bird(); animal.fly("I am flying"); animal.sing("I am singing"); animal.walk("I am walking"); break;
		case "Butterfly":
		case "butterfly" : animal = new Butterfly();break;		
		case "Cat":
		case "cat" : animal = new Cat();break;
		case "Chicken":
		case "chicken" : animal = new Chicken();break;
		case "Clownfish":
		case "clownfish" : animal = new Clownfish();break;
		case "Dog":
		case "dog" : animal = new Dog();break;
		case "Dolphin":
		case "dolphin" : animal = new Dolphin();break;
		case "Duck":
		case "duck" : animal = new Duck();break;
		case "Fish":
		case "fish" : animal = new Fish();break;
		case "Frog":
		case "frog" : animal = new Frog();break;
		case "Parrot":
		case "parrot" : animal = new Parrot();break;
		case "Rooster":
		case "rooster" : animal = new Rooster();break;
		case "Shark":
		case "shark" : animal = new Sharks();break;	
		default: animal = new Bird(); 		
		}
		
		return animal;
	}
	
}
