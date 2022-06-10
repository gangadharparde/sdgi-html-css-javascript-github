package day2.chair.game;

import java.util.Scanner;

public class Solution1 {

	static long chairGame(int n) {
		if (n < 2)
			return 0;
		if (n == 2)
			return 1;
		int M = 1000000007;
		long[] t = new long[n + 1];
		t[2] = 1;
		for (int i = 3; i < n + 1; i++) {
			System.out.println("("+i+" - 1):" + (i - 1));
			System.out.println("t["+i+" - 1]:" + t[i - 1]);
			System.out.println("t["+i+" - 2]:" + t[i - 2]);
			System.out.println("((i - 1) * (t[i - 1] + t[i - 2])) % M:" + ((i - 1) * (t[i - 1] + t[i - 2])) % M);
		 t[i] = ((i - 1) * (t[i - 1] + t[i - 2])) % M;
		 }
		
		return t[n];
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			long result = chairGame(n + 1);
			System.out.println(result);
		}

	}

}