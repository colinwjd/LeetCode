package colin.leetcode;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Created by Colin Wang on 2015-05-13.
 */
public class ClimbingStairs {
	public int climbStairs(int n) {
		return getFib(n);
	}

	private int getFib(int n) {
		int x = 0;
		int y = 1;
		for (int i = 1; i <= n; i++) {
			y = x + y;
			x = y - x;
		}
		return y;
	}
}
