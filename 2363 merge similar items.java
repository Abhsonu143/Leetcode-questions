public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<items1.length;i++)
            map.put(items1[i][0],map.getOrDefault(items1[i][0],0)+items1[i][1]);
        for(int i=0;i<items2.length;i++)
            map.put(items2[i][0],map.getOrDefault(items2[i][0],0)+items2[i][1]);
        List<List<Integer>> res=new ArrayList();
        for(int i=1;i<=1000;i++)
            if(map.containsKey(i)){
                res.add(new ArrayList());
                res.get(res.size()-1).add(i);
                res.get(res.size()-1).add(map.get(i));
            }
        return res;
        
    }