/**
 * 
 */
package colin.leetcode;

import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 27, 2015
 */
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = null;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			int other = target - numbers[i];
			if (map.containsKey(other)) {
				result = new int[2];
				result[0] = map.get(other);
				result[1] = i + 1;
				break;
			}
			map.put(numbers[i], i + 1);
		}
		return result;
	}
}
