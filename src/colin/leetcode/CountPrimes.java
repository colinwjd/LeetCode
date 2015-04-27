/**
 * 
 */
package colin.leetcode;


/**
 * Count the number of prime numbers less than a non-negative number, n Hint:
 * The number n could be in the order of 100,000 to 5,000,000.
 * 
 * @author Colin Wang Created on Apr 27, 2015
 */
public class CountPrimes {
	public int countPrimes(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	private boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
