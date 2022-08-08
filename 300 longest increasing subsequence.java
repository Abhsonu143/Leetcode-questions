public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=1;
        int res=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i])
                    dp[i]=Math.max(dp[i],1+dp[j]);
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }