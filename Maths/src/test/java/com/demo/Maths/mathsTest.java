package com.demo.Maths;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.Maths.Maths;

public class mathsTest {

	@Test
	public void testAdd() {
		Maths m = new Maths();
		assertEquals(4, m.add(2, 2));
	}
}

