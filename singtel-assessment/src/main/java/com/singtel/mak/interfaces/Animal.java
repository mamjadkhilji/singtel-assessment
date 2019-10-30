/**
 * 
 */
package com.singtel.mak.interfaces;

/**
 * @author Amjad 
 *
 */
public interface Animal {
	void walk(String behavior);
	void fly(String behavior);
	void sing(String behavior);
	void swim(String behavior);
	
	String getWalkBehavior();
	String getFlyBehavior();

	String getSingBehavior();

	String getSwimBehavior();
}
