package day1.make.palindrome;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	public static Set<String> findPermutations(String str) {
		Set<String> partial = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			partial.add("");
			return partial;
		}
		char initial = str.charAt(0); // first character
		String rem = str.substring(1); // Full string without first character
		Set<String> words = findPermutations(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				partial.add(charInsert(strNew, initial, i));
			}
		}
		return partial;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			Set<String> allpalin = findPermutations(str);
			int count = 0;
			String[] str1 = allpalin.toArray(new String[allpalin.size()]);
			for (int i = 0; i < allpalin.size(); i++) {
				String reverse = new StringBuffer(str1[i]).reverse().toString();
				if (reverse.equals(str1[i]) && reverse.charAt(0) == str.charAt(0)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
