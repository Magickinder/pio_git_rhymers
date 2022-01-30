package edu.kis.vh.nursery;

/**
 *	Class responsible for creating stack and managing it
 *
 *	getTotal() - returns number of values in stack
 *	countIn(int in) - add value to stack if it's not full
 *	callCheck() - checks if list is empty
 *	isFull() - checks if list is full
 *	peekABoo() - returns last value in stack if it's not empty
 *	countOut() - returns last value in stack and reduces stack size by one
 */

public class DefaultCountingOutRhymer {

	private static final int ARR_SIZE = 12;
	private static final int EMPTY_LIST = -1;
	private static final int FULL_LIST = 11;

	private final int[] numbers = new int[ARR_SIZE];

	private int total = EMPTY_LIST;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_LIST;
	}
		
	public boolean isFull() {
		return total == FULL_LIST;
	}
		
	protected int peekABoo() {
		if (callCheck())
			return EMPTY_LIST;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return EMPTY_LIST;
		return numbers[total--];
	}

}
