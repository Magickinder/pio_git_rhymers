package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
	// Wiersze 6, 13, 15, 16 były źle sformatowane

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekABoo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
