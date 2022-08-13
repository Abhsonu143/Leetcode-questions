public TreeNode sortedListToBST(ListNode head) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        if(n==0) return null;
        return buildTree(head,0,n-1);
    }
    private static TreeNode buildTree(ListNode head,int low,int high){
        if(low>high) return null;
            int mid=low+(high-low)/2;
        ListNode curr=head;
        int i=low;
        while(i++<mid)
            curr=curr.next;
        TreeNode root=new TreeNode(curr.val);
        root.left=buildTree(head,low,mid-1);
        root.right=buildTree(curr.next,mid+1,high);
        return root;
    }