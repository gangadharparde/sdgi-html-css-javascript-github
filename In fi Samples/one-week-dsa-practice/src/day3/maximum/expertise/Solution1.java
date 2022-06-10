package day3.maximum.expertise;

import java.util.Scanner;


public class Solution1 {
	public static int xorOpt(int N, int K, int[] A, int[] Parent) {
		int x = 0, temp = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				//System.out.println(A[i]+" "+Parent[j]);
				if (A[i] == Parent[j]) {
					temp = Math.max(temp, A[i]);
				}
			}
		}
		x = temp;
		if (K > N) {
			x = x - 1;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int[] Parent = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			Parent[i] = sc.nextInt();
		}
		System.out.println(xorOpt(N, K, A, Parent));
		sc.close();
	}
}