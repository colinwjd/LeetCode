/**
 * 
 */
package colin.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a list of non negative integers, arrange them such that they form the
 * largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of
 * an integer.
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 26, 2015
 */
public class LargestNumber {

	public String largestNumber(int[] num) {
		if (num == null || num.length == 0)
			return "";

		String[] number = new String[num.length];
		for (int i = 0; i < num.length; i++) {
			number[i] = String.valueOf(num[i]);
		}
		Arrays.sort(number, cmpt);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < number.length; i++) {
			sb.insert(0, number[i]);
		}
		String result = sb.toString();
		if (result.charAt(0) == '0')
			return "0";
		return result;
	}

	Comparator<String> cmpt = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			String a = o1 + o2;
			String b = o2 + o1;
			return a.compareTo(b);
		}
	};

}
