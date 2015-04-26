package colin.leetcode;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 21, 2015
 */
public class SearchInRotatedSortedArray {
	public int search(int[] A, int target) {
		int minIndex = minIndex(A);
		int result = binarySearch(A, 0, minIndex - 1, target);
		if (result == -1)
			result = binarySearch(A, minIndex, A.length - 1, target);
		return result;
	}

	private int binarySearch(int[] a, int low, int high, int target) {
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (target < a[mid])
				high = mid - 1;
			else if (target > a[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	private int minIndex(int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (a[mid] > a[high]) {
				// 转折点在右半部分
				low = mid + 1;
				if (high == low)
					return low;
			} else {
				// 转折点在左半部分
				high = mid;
				if (high == low)
					return low;
			}
		}
		// 转折点不存在，则第一个元素就是最小的
		return 0;
	}

	public static void main(String[] args) {
		SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
		int[] a = { 6, 7, 0, 1, 2 };
		System.out.println(sirsa.minIndex(a));

	}
}
