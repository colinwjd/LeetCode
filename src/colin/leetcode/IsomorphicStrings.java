package colin.leetcode;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 * <p>
 * Given "paper", "title", return true.
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 * Created by colin on 6/7/15.
 */
public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		int[] map = new int[512];
		for (int i = 0; i < s.length(); i++) {
			if (map[s.charAt(i)] != map[t.charAt(i) + 256])
				return false;
			map[s.charAt(i)] = map[t.charAt(i) + 256] = i + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 'A'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}
}
