package colin.leetcode;

public class HappyNumber {

	public boolean isHappy(int n) {
		int slow, fast;
		slow = n;
		fast = n;
		do {
			slow = square(slow);
			fast = square(fast);
			fast = square(fast);
		} while (slow != fast);

		return slow == 1;
	}

	private int square(int n) {
		int sum = 0;
		while (n != 0) {
			int x = n % 10;
			sum += x * x;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new HappyNumber().square(68));
		System.out.println(new HappyNumber().isHappy(19));
	}
}
