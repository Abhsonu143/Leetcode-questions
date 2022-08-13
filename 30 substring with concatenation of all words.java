class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res=new ArrayList<>();
        int wc=words.length,wl=words[0].length(),n=s.length();
        if(n<wc*wl) return res;
        
        Map<String,Integer> map=new HashMap();
        for(int i=0;i<wc;i++)
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        Map<String,Integer> currMap=new HashMap();
        for(int i=0;i<=n-(wc*wl);i++){
            if(map.containsKey(s.substring(i,i+wl))){
                for(int j=i;j<(i+wc*wl);j+=wl){
                    String str=s.substring(j,j+wl);
                    currMap.put(str,currMap.getOrDefault(str,0)+1);
                }
                if(map.equals(currMap))
                    res.add(i);
                currMap.clear();
            }
        }
        return res;
    }
}
