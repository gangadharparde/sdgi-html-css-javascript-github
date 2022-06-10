package day3.string.update;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nn = new int[n];
		for (int i = 0; i < n; i++) {
			nn[i] = sc.nextInt();
		}
		int min_temp = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (i + 1 < n) {
				min_temp = Math.min(min_temp, nn[i] + nn[i + 1]);
			}
		}
		min_temp *= 2;
		System.out.println("Output:");
		System.out.println(min_temp);
		sc.close();
	}
}