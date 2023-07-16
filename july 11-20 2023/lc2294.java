// You are given an integer array nums and an integer k. You may partition nums into one or more subsequences 
// such that each element in nums appears in exactly one of the subsequences.

// Return the minimum number of subsequences needed such that the difference between the maximum and 
// minimum values in each subsequence is at most k.

// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements 
// without changing the order of the remaining elements.

 import java.util.*;

class Solution {
    public int partitionArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int ans=1;
        int n=nums.length;

        int l=0;
       for(int r=0;r<n;r++){

           if(nums[r]-nums[l]>k){
              ans++;
              l=r;
           }
           
       }

       return ans;
 

        
    }
}