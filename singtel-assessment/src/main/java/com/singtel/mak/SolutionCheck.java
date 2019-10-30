/**
 * 
 */
package com.singtel.mak;   

import java.util.ArrayList;
import java.util.List;

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

/**
 * @author Amjad
 *
 */
public class SolutionCheck { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal bird = new Bird();
		bird.walk("I am walking");
		bird.fly("I am flying");
		bird.sing("I am singing");

		Animal[] animals = new Animal[]{
				bird,
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				//new Animal(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		List<Animal> singingAnimals = new ArrayList<Animal>();
		List<Animal> flyingAnimals = new ArrayList<Animal>();
		List<Animal> swimmingAnimals = new ArrayList<Animal>();
		List<Animal> walkingAnimals = new ArrayList<Animal>();
		
		for (Animal animal : animals) {
			if(animal.getSingBehavior()!=null) { singingAnimals.add(animal); }
			if(animal.getFlyBehavior()!=null) { flyingAnimals.add(animal); }
			if(animal.getSwimBehavior()!=null) { swimmingAnimals.add(animal); }
			if(animal.getWalkBehavior()!=null) { walkingAnimals.add(animal); }
		}
		
		System.out.println("\nhow many of these animals can sing? ->"+singingAnimals.size());
		System.out.println("how many of these animals can fly? ->"+flyingAnimals.size());
		System.out.println("how many of these animals can swim? ->"+swimmingAnimals.size());
		System.out.println("how many of these animals can walk? ->"+walkingAnimals.size());
		System.out.println("\n");
		
		//Dual Language ROOSTER
		new Rooster();
		new Rooster("Swedish");
		new Rooster("Turkish");
		new Rooster("Urdu");
	}

}
