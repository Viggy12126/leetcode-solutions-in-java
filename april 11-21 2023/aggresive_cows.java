// Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).

// His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
// Input
// t – the number of test cases, then t test cases follows.
// * Line 1: Two space-separated integers: N and C
// * Lines 2..N+1: Line i+1 contains an integer stall location, xi
// Output
// For each test case output one integer: the largest minimum distance.

import java.util.*;
import java.lang.*;

public class aggressive_cows
{
    
    	public static boolean isPossible(int[] arr,int n,int dist,int cows){
		
		int count=1;
		int c=arr[0];
		
		for(int i=1;i<n;i++){
			
			if(arr[i]-c>=dist){
				c=arr[i];
				count++;
			}
			
			if(count==cows)
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
	    
	    	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
			int n=sc.nextInt();
			int cows=sc.nextInt();
			int ans=0;
			
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			int low=1;
			int high=arr[n-1]-arr[0];
			
			while(low<=high){
				int mid=(low+high)/2;
				// 	System.out.println("mid is "+mid);
					
				if(isPossible(arr,n,mid,cows)){
					ans=mid;
					low=mid+1;
				}
				else
				high=mid-1;
			}
			
			System.out.println(ans);
		}
	
	}
}
	