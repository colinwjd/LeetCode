package colin.leetcode;

/**
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up: Could you do this in-place?
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 23, 2015
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				temp[row][col] = matrix[row][col];
			}
		}
		
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				matrix[row][col] = temp[n - 1 - col][row];
			}
		}
	}
	
	public static void main(String[] args) {
		int [][] test = new int[3][4];
		System.out.println(test[0].length);
	}
}
