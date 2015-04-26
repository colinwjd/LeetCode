package colin.leetcode;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example: A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 17, 2015
 */
public class ExcelSheetColumnNumber {
	/*
	 * 解题思路：26进制数字转化为10进制数
	 */
	public static int titleToNumber(String s) {
		int result = 0;
		int pow = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			result += ((int) s.charAt(i) - 64) * Math.pow(26, pow++);
		}
		return result;
	}

	public static void main(String[] args) {
		String a = "AA";
		System.out.println(ExcelSheetColumnNumber.titleToNumber(a));
	}
}
