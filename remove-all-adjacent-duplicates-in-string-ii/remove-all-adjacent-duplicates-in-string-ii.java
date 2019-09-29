class Solution {
    public String removeDuplicates(String s, int k) {
        List<int[]> skips = new ArrayList<>();
        int currentCount = 0;
        
        for(int i=1; i< s.length();i++){
            
            if(s.charAt(i) == s.charAt(i-1)){
                currentCount +=1;
            }else {
                currentCount =0;
            }
            if(currentCount == k-1){
                skips.add(new int[]{i-k+1,i});
                currentCount = 0;
            }
        }
        if(skips.size() > 0){
            StringBuilder sb = new StringBuilder();
            int j =0;
            for(int i =0; i<s.length();){
                if(j < skips.size() && skips.get(j)[0] == i){
                    i = skips.get(j)[1]+1;
                    j +=1;
                }else {
                    sb.append(s.charAt(i));
                    i+=1;
                }
            }
            return removeDuplicates(sb.toString(),k);
        }
        return s;
    }
}
