package colin.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 * Created by colin on 6/3/15.
 */
public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		if (s == null || s.trim().length() == 0) {
			return 0;
		}

		String[] tokens = s.split(" ");
		String last = tokens[tokens.length -1];
		return last.toCharArray().length;
	}

	public static void main(String[] args) {
		String s = "Hello World";
		int length = lengthOfLastWord(s);
		System.out.print(length);
	}
}
