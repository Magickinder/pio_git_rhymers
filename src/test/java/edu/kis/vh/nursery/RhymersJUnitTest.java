package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountInDefaultRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekABoo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheckDefaultRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int RHYMER_COUNT_IN_VALUE = 888;
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(RHYMER_COUNT_IN_VALUE);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFullDefaultRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		final int RHYMER_COUNT_IN_VALUE = 888;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(RHYMER_COUNT_IN_VALUE);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekabooDefaultRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekABoo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);

		result = rhymer.peekABoo();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.peekABoo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOutDefaultRhymer() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountOutFIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int[] TEST_ARRAY = {1, 2};

		for (int j : TEST_ARRAY) {
			rhymer.countIn(j);
		}

		result = rhymer.countOut();
		Assert.assertEquals(TEST_ARRAY[0], result);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_ARRAY[1], result);

		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountInHanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();

		final int[] TEST_ARRAY = {1, 2};

		rhymer.countIn(TEST_ARRAY[0]);

		int result = rhymer.peekABoo();
		Assert.assertEquals(TEST_ARRAY[0], result);
		int totalRejected = rhymer.reportRejected();
		Assert.assertEquals(0, totalRejected);

		rhymer.countIn(TEST_ARRAY[1]);
		result = rhymer.peekABoo();
		Assert.assertEquals(TEST_ARRAY[0], result);
		totalRejected = rhymer.reportRejected();
		Assert.assertEquals(1, totalRejected);
	}

}
