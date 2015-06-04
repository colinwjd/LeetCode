package colin.leetcode;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * Created by colin on 6/4/15.
 */
public class ExcelSheetColumnTitle {

	public static String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
		while (n > 0) {
			if (n % 26 != 0) {
				sb.append((char)('A' + n % 26 - 1));
			} else {
				sb.append('Z');
				n = n / 26 -1;
				continue;
			}
			n = n / 26;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		int n = 52;
		System.out.print(convertToTitle(n));
	}
}
