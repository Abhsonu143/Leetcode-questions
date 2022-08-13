public TreeNode createBinaryTree(int[][] des) {
        int n=des.length;
        Map<Integer,TreeNode> map=new HashMap();
        Set<Integer> set=new HashSet();
        for(int i=0;i<n;i++){
            TreeNode root,child;
            
            if(map.containsKey(des[i][0])) root=map.get(des[i][0]);
            else{
                root=new TreeNode(des[i][0]);
                map.put(des[i][0],root);
            }
            if(map.containsKey(des[i][1])) child=map.get(des[i][1]);
            else{
                child=new TreeNode(des[i][1]);
                map.put(des[i][1],child);
            }
            set.add(des[i][1]);
            if(des[i][2]==1)
                root.left=child;
            else
                root.right=child;
        }
        for(int i=0;i<n;i++)
            if(!set.contains(des[i][0]))
                return map.get(des[i][0]);
        return map.get(des[0][0]);
    }