/**
 * 
 */
package colin.leetcode;

/**
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 23, 2015
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		return plus(digits, 0, digits.length - 1);
	}

	public int[] plus(int[] digits, int start, int end) {
		if (digits[end] < 9) {
			// 不需要进位
			digits[end]++;
			return digits;
		} else {
			// 需要进位，将本位设为0
			digits[end] = 0;
			if (end == 0) {
				// 最高位需要进位
				int[] result = new int[digits.length + 1];
				result[0] = 1;
				for (int i = 0; i < digits.length; i++) {
					result[i + 1] = digits[i];
				}
				return result;
			}
			// 需要进位则将前一位加一，递归进行
			return plus(digits, start, end - 1);
		}
	}

}
