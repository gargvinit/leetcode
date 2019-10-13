class Solution {
    public int maxEqualFreq(int[] nums) {
        Map<Integer,Integer> intCount = new HashMap<>();
        Map<Integer,Integer> countCount = new TreeMap<>();
        int max=0;
        for(int i =0; i< nums.length;i++){
            intCount.putIfAbsent(nums[i],0);
            int currentCount = intCount.get(nums[i]);
            intCount.put(nums[i], currentCount+1);
            if(countCount.containsKey(currentCount)){
                countCount.put(currentCount,countCount.get(currentCount)-1);
                if(countCount.get(currentCount) ==0){
                    countCount.remove(currentCount);
                }
            }
            countCount.putIfAbsent(currentCount+1,0);
            countCount.put(currentCount+1,countCount.get(currentCount+1)+1);
           
            if(intCount.size() == 1 || (countCount.size() == 1 && countCount.keySet().iterator().next()==1)){
                max = i +1;
            }
            if(countCount.size() == 2){
                Iterator<Integer> it = countCount.keySet().iterator();
                int x = it.next();
                int y = it.next();
                int a = countCount.get(x);
                int b = countCount.get(y);
                if(x*a == 1 || y*b == 1 || x-y == 1 && a == 1 || y-x == 1 && b ==1){
                    max = i+1;
                }
            }
        }
        return max;
    }
}
