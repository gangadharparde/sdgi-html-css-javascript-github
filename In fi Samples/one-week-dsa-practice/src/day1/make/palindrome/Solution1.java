package day1.make.palindrome;

import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {
	static long factorial(long n) {
		long f = 1;
		for (int i = 2; i <= n; i++)
			f *= i;
		return f;

	}

	static long countPalindromes(String s) {
		int n = s.length();
		if (n == 0)
			return 0;
		int M = 1000000007;
		HashMap<Character, Integer> map = new HashMap<>();
		int limit = n / 2 - 1;
		for (int i = 1; i <= limit; i++) {
			Character e = s.charAt(i);
			map.put(e, map.getOrDefault(e, 0) + 1);

		}
		long count = factorial(limit) % M;
		for (int e : map.values())
			count = (count / factorial(e)) % M;
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(countPalindromes(input));
		sc.close();
	}
}