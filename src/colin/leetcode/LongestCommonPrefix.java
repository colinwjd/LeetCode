/**
 * 
 */
package colin.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Mar 6, 2015
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		int len = 0;
		for (int i = 1; i <= strs.length; i++) {
			len = lcp(strs[i], strs[i - 1]);
		}
		return (len == 0) ? "" : strs[0].substring(0, len);
	}

	private int lcp(String s, String t) {
		int N = Math.min(s.length(), t.length());
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) != t.charAt(i))
				return i;
		}
		return N;
	}
}
