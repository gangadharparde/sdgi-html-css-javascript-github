package day2.equal.sum.pairs;

public class Solution {
	static int maxCount(int[] freq, int max, int min) {
		int n = freq.length - 1;
		int ans = 0;
		for (int sum = 2 * min; sum <= 2 * max; ++sum) {
			// Count of pairs with given sum
			int possiblePair = 0;
			for (int fElement = 1; fElement < (sum + 1) / 2; fElement++) {

				// Check for a possible pair
				if (sum - fElement <= max) {
					// Update count of possible pair
					possiblePair += Math.min(freq[fElement], freq[sum - fElement]);
				}
			}

			if (sum % 2 == 0) {
				possiblePair += freq[sum / 2] / 2;
			}
			ans = Math.max(ans, possiblePair);
		}

		// Return the max possible pair
		return ans;
	}

	// Function to return the
	// count of pairs
	static int pairs(int[] a) {

		int n = a.length;
		int[] freq = new int[n + 1];
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		for (int i = 0; i < n; ++i)
			freq[a[i]]++;

		return maxCount(freq, max, min);
	}

	public static void main(String[] args) {
		int[] a = { 6, 4, 4, 7, 7, 7, 3 };

		System.out.println(pairs(a));
		
		int[] b = {4, 1, 7, 6, 7, 6, 5, 8};
		System.out.println(pairs(b));
	}
}
