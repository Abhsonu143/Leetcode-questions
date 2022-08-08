public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++)
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i,0)+1);
        long res=0;
        for(int i=0;i<n;i++){
            int diff=nums[i]-i;
            if(map.get(diff)==1)
                map.remove(diff);
            else
                map.put(diff,map.get(diff)-1);
            res=res+(long)(n-i-1)-(long)map.getOrDefault(diff,0);
        }
        return res;
    }