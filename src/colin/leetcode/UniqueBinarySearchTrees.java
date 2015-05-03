package colin.leetcode;

/**
 * Given n, how many structurally unique BST's (binary search trees) that store
 * values 1...n? For example, Given n = 3, there are a total of 5 unique BST's.
 * 
 * 1         3     3      2      1
 *  \       /     /      / \      \
 *   3     2     1      1   3      2
 *  /     /       \                 \
 * 2     1         2                 3
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 22, 2015
 */
public class UniqueBinarySearchTrees {
	/*
	// 递归解法
	public int numTrees(int n) {
		int num = 0;
		if (n == 0)
			return 1;
		for (int i = 1; i <= n; i++) {
			num += numTrees(i - 1) * numTrees(n - i);
		}
		return num;
	}
	*/
	
	// 非递归解法
	public int numTrees(int n) {
		int[] num = new int[n + 1];
		num[0] = num[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				num[i] += num[j - 1] * num[i - j];
			}
		}
		
		return num[n];
	}
	
	public static void main(String[] args) {
		UniqueBinarySearchTrees ubst = new UniqueBinarySearchTrees();
		System.out.println(ubst.numTrees(3));
	}
}
