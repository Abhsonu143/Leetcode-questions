public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
    public TreeNode create(int[] arr,int low,int high){
        if(low>high) return null;
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=create(arr,low,mid-1);
        root.right=create(arr,mid+1,high);
        return root;
    }