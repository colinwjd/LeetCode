package colin.leetcode;

/**
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * click to show spoilers.
 * <p>
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * <p>
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * <p>
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 * <p>
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * Created by colin on 6/7/15.
 */
public class ReverseInteger {

	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		return (int) result;
	}
}
