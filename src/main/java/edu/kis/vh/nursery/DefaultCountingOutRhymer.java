package edu.kis.vh.nursery;

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
