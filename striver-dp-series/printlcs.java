public class printlcs {
    
    public void longestCommonSubsequence(String s1, String s2) {
        
        int n=s1.length();
        int m=s2.length();
      int[][] dp=new int[n+1][m+1];
    
        // return helper(text1,text2,n,m,dp);
    
        for(int i=0;i<=n;i++)
        dp[i][0]=0;
    
        for(int j=0;j<=m;j++)
        dp[0][j]=0;
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
    if(s1.charAt(i-1)==s2.charAt(j-1))
    dp[i][j]=1+dp[i-1][j-1];
    else
    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
    
       int len=dp[n][m];
       String str="";
       for(int i=0;i<len;i++)
       str+="$";

       char[] ans=str.toCharArray();

       int ind=len-1;
       int i=n;
       int j=m;
       while(i>0 && j>0){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            ans[ind]=s1.charAt(i-1);
            i--;
            j--;
            ind--;

        }
        else if(dp[i][j-1]>dp[i-1][j]){
j--;
        }else{
i--;
        }
       }

       
    }
}
