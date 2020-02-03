package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;

class Tester {
	Counter count;
	
	@BeforeEach
	void instantiateCount() { //instantiates a new counter before each new test case
		count = new Counter();
	}
	
	//EDWARDS TEST CASES
	@Test
	void singleIncrement() { //increment by 1
		count.increment();
		assertEquals(1, count.getCount());
		
	}
	
	@Test
	void zeroCount() { // Counter is initialized with its count == 0
		assertEquals(0, count.getCount());		
	}
	
	@Test
	void incrementDecrement() { // increment by 1 and decrement by 1
		count.increment();
		count.decrement();
		assertEquals(0, count.getCount());
		
	}
	
	@Test
	void incrementMultiple() { //tests the overloaded increment method
		count.increment(5);
		assertEquals(5, count.getCount());
	}
	
	@Test
	void decrementMultiple() { // tests the overloaded decrement method
		count.decrement(5);
		assertEquals(-5, count.getCount());
	}
	//END OF EDWARDS TEST CASES
	
	//BENS TEST CASES
	@Test
	void resets() { // resets the counter to 0
		count.increment(100);
		assertEquals(100, count.getCount());
		count.reset();
		assertEquals(0, count.getCount());
	}
	
	@Test
	void decrementToNegative() { // makes the counter negative
		count.decrement(100);
		assertTrue(count.getCount() < 0);
		
	}
	
	@Test 
	void incrementResetIncrement(){ //increment then reset and then increment again
		count.increment();
		assertEquals(1, count.getCount());
		count.reset();
		assertEquals(0, count.getCount());
		count.increment();
		assertEquals(1, count.getCount());		
	}
	
	@Test
	void incrementAndOverload() { //use both methods of increment
		count.increment();
		assertEquals(1, count.getCount());
		count.increment(100);
		assertEquals(101, count.getCount());
	}
	@Test
	void decrementAndOverload() { //use both methods of decrement
		count.decrement();
		assertEquals(-1, count.getCount());
		count.decrement(100);
		assertEquals(-101, count.getCount());
	}
	
	//END OF BENS TEST CASES
	
	//PRINCE TEST CASES
	@Test
	void incrementWithNegative(){ // increment with negative number while count is 0
		assertTrue(count.getCount() == 0);
		count.increment(-100);
		assertEquals(-100, count.getCount());
	}
	@Test
	void decrementWithNegative() { // decrement with negative while count 0
		assertTrue(count.getCount() == 0);
		count.decrement(-100);
		assertEquals(100, count.getCount());
	}
	@Test
	void negativeIncrement() { //increment with a negative number while the count is negative
		count.decrement(10);
		assertTrue(count.getCount() < 0);
		count.increment(-100);
		assertEquals(-110, count.getCount());		
	}
	@Test
	void negativeDecrement() { // decrement with a negative number while count is negative
		count.decrement(10);
		assertTrue(count.getCount() < 0);
		count.decrement(-100);
		assertEquals(90, count.getCount());
	}
	@Test
	void negativeIncrementPos() { //increment with a negative number while count is positive
		count.increment(123);
		assertTrue(count.getCount() > 0);
		count.increment(-123);
		assertEquals(0, count.getCount());
	}	
	//END OF PRINCE TEST CASES
	
	//BRUCE TEST CASES
	
	@Test
	void decrementResetDecrement() { // Decrements, resets and decrements again
		count.decrement(1);
		assertTrue(count.getCount() < 0);
		count.reset();
		assertTrue(count.getCount() == 0);
		count.decrement(1);
		assertTrue(count.getCount() < 0);		
	}
	@Test
	void negativeDecrementPos() { //decrements with a negative number while count is positive
		count.increment(123);
		assertTrue(count.getCount() > 0);
		count.decrement(-123);
		assertEquals(246, count.getCount());		
	}
	
	@Test
	void incrementToPositive() { //increments counter just after instantiation to see if count is positive
		count.increment(1);
		assertTrue(count.getCount() > 0);
	}
	@Test
	void resetReset() {// call the reset method multiple times to make sure count stays at 0
		count.reset();
		count.reset();
		count.reset();
		assertTrue(count.getCount() == 0);
	}
	
	@Test
	void resetAfterEvery() {//check that reset works after every method called
		count.decrement();
		count.reset();
		assertTrue(count.getCount() == 0);
		count.increment();
		count.reset();
		assertTrue(count.getCount() == 0);
		count.decrement(100);
		count.reset();
		assertTrue(count.getCount() == 0);
		count.increment(100);
		count.reset();
		assertTrue(count.getCount() == 0);
	}
	//END OF BRUCE TEST CASES
	
	
	
	
	

}
