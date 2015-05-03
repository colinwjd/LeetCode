package colin.leetcode;

/**
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * <p>
 * For example, given the range [5, 7], you should return 4.
 * Created by Colin Wang on 2015-05-03.
 */
public class BitwiseANDOfNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int factor = 1;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			factor <<= 1;
		}
		return m * factor;
	}
}
