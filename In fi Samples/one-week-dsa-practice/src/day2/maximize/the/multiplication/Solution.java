package day2.maximize.the.multiplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			Integer [] elements = new Integer[n];
			for (int i = 0; i < n; i++) {
				elements[i] = Math.abs(sc.nextInt());
			}
			int howManyToChoose = sc.nextInt();
			Arrays.sort(elements, Comparator.reverseOrder());
			int result=1;
			for(int i=0; i<howManyToChoose;i++) {
				System.out.println(elements[i]);
				result*=elements[i];
			}
			System.out.println(result);
		}
	}

}
