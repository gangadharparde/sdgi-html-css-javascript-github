package day3.gcd.maximization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1
{
    static int gcdMaximization(int a[], int n){
        int []Prefix = new int[n+2];
        int []Suffix = new int[n+2];
        
        Prefix[1]= a[0];
        for(int i=2; i<=n; i+=1){
            Prefix[i] = _gcd(Prefix[i-1],a[i-1]);
        }
        Suffix[n] = a[n-1];
        for(int i = n-1; i>=1 ;i-=1){
            Suffix[i] = _gcd(Suffix[i+1],a[i-1]);
        }
        int ans = Math.max(Suffix[2],Prefix[n-1]);
        for(int i=2;i<n;i+=1){
            ans = Math.max(ans,_gcd(Prefix[i-1],Suffix[i+1]));
        }
        return ans;
    }
    static int _gcd(int a, int b){
        return b==0 ? a: _gcd(b,a%b);
    }
    
	public static void main(String[] args) {
	    Scanner scan =new Scanner(System.in);
		int N= Integer.parseInt(scan.nextLine().trim());
		List<Integer> A =new ArrayList<>(N);
		for(int j=0;j<N;j++)
		{
		    A.add(Integer.parseInt(scan.nextLine().trim()));
		}
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
		    arr[i]=A.get(i);
		    
		}
	    
	    int result = gcdMaximization(arr,N);
	    System.out.println(result);
		
	}
}
