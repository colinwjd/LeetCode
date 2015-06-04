package colin.leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 * Created by colin on 6/4/15.
 */
public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		if (s == null)
			return true;
		if (s.trim().length() == 0)
			return true;
		String str = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122 || (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				sb.append(str.charAt(i));
			}
		}
		String newString = sb.toString();
		System.out.println(newString);
		if (newString.length() == 0)
			return true;
		int i = 0;
		int j = newString.length() - 1;
		while (i < j) {
			if (newString.charAt(i++) != newString.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String test = "0k.;r0.k;";
		boolean flag = isPalindrome(test);
		System.out.print(flag);
	}
}
