package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}

	@Test
	public void feedCat() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	@Test
	public void runCat() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	@Test
	public void feedCatThenRunCat() {
		Cat cat = new Cat();
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);
	}
	@Test
	public void deadCat() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assert(cat.isAlive() == false);
	}
}