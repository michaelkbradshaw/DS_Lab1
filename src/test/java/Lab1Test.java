import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab1Test {

	@Test
	void testSquares() {
		assertEquals(55,Lab1.squares(5));
		assertEquals(1,Lab1.squares(1));
	    assertEquals(0,Lab1.squares(0));
	    assertEquals(-1,Lab1.squares(-10));
	    assertEquals(-1,Lab1.squares(-1));
	}

	@Test
	void testMaxIndex() {
		
		int [] one = {10,20,30,30};
	    assertEquals(2,Lab1.maxIndex(one,3));
	   
	    int [] two = {10,30,20};
	    assertEquals(1,Lab1.maxIndex(two,3));
	   
	    int [] three = {30,10,20};
	    assertEquals(0,Lab1.maxIndex(three,3));
	   
	    assertEquals(-1,Lab1.maxIndex(null,0));
	      
        //use a trick to reuse other arrays
	    assertEquals(1,Lab1.maxIndex(one,2));
	   
	   
	    int []  five = {30,10};
	    assertEquals(0,Lab1.maxIndex(five,2));
	   
	    assertEquals(0,Lab1.maxIndex(one,1));
	   
	   
	    assertEquals(2,Lab1.maxIndex(one,4));
	   
	}

	@Test
	void testSeek() {
		int [] one = {1,2,3,4,5};
	      
	      assertTrue(Lab1.seek(one,5,1));
	      assertTrue(Lab1.seek(one,5,5));
	      assertTrue(Lab1.seek(one,5,3));
	      assertFalse(Lab1.seek(one,5,-10));
	      assertFalse(Lab1.seek(one,0,1));
		
	}

	@Test
	void testFib() {
		assertEquals(8, Lab1.fib(6));
	      assertEquals(2, Lab1.fib(3));
	      assertEquals(1, Lab1.fib(1));
	      assertEquals(34, Lab1. fib(9));
	      assertEquals(0, Lab1. fib(-1));
	}

}