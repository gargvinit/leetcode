class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength = 0;
        for(int i =0; i < s.length();i++){
            int currentCost = 0;
            for(int j =i; currentCost <= maxCost && j < s.length();j++){
                currentCost += Math.abs(s.charAt(j)-t.charAt(j));
                if(currentCost <= maxCost){ maxLength = Math.max(j-i+1,maxLength);}
            }
        }
        return maxLength;
    }
    
    
}
