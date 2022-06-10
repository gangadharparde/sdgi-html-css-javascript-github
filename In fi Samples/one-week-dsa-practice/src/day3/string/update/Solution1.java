package day3.string.update;

import java.util.Scanner;
public class Solution1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a[]=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
		    if(a[i]=='1'&&a[i+1]=='0')
		    {
		        count+=1;
		        a[i+1]='1';
		       
		    }
		}
		System.out.println(count);
	}
}
