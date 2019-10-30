package com.singtel.mak.interfaces.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BirdTest { 

	static Bird bird;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		bird = mock(Bird.class);
	}

	@Test
	void testWalk() {
		doNothing().when(bird).walk("I am walking");
		assertNull(bird.getWalkBehavior());
	}

	@Test
	void testFly() {
		doNothing().when(bird).fly("I am flying");
		assertNull(bird.getFlyBehavior());
	}

	@Test
	void testSing() {
		doNothing().when(bird).sing("I am singing");
		assertNull(bird.getSingBehavior());
	}

	@Test
	void testSwim() {
		doNothing().when(bird).swim("I am swimming");
		assertNull(bird.getSwimBehavior());
	}

	@Test
	void testGetWalkBehavior() {
		assertNull(bird.getWalkBehavior());
	}

	@Test
	void testGetFlyBehavior() {
		assertNull(bird.getFlyBehavior());
	}

	@Test
	void testGetSingBehavior() {
		assertNull(bird.getSingBehavior());
	}

	@Test
	void testGetSwimBehavior() {
		assertNull(bird.getSwimBehavior());
	}

}
