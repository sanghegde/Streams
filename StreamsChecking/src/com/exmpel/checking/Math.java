//class math which includes all the methods of operation
package com.exmpel.checking;

public class Math {
	public int checker(performOperation p, int num) {
		return p.check(num);

	}

	// check even or odd
	performOperation checkEvenOdd() {
		performOperation p = (a) -> {
			return a % 2;
		};
		return p;
	}

	// checkprime
	performOperation checkPrime() {
		performOperation p = (a) -> {
			if (a == 1)
				return 1;
			for (int i = 2; i < a / 2 + 1; i++) {
				if ((a % i) == 0)
					return 1;
			}
			return 0;

		};
		return p;
	}

	// check pallindrome
	performOperation checkPallindrome() {
		performOperation p = (a) -> {
			String word = "" + a;
			boolean isPallindrome = true;
			for (int i = 0; i < (int) word.length() / 2; i++) {
				if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					isPallindrome = false;
					break;
				}
			}
			return isPallindrome ? 0 : 1;
		};
		return p;
	}

}
