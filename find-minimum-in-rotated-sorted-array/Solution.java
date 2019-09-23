class Solution {
    public int findMin(int[] nums) {
        return findMin(nums,0,nums.length-1);
    }
    
    private int findMin(int[] nums, int start, int end){
        if(start >= end){return nums[start];}
        int mid = (start+end)/2;
        
        int leftMin;
        if(mid == 0 || nums[mid-1] > nums[start]){
            leftMin = nums[start];
        }else {
           leftMin= findMin(nums,start, mid-1);
        }
        int rightMin;
        if(mid == end || nums[mid+1] < nums[end]){
            rightMin = nums[mid+1];
        }else {
           rightMin= findMin(nums,mid+1, end);
        }        
        return mid >= start && mid <= end && nums[mid] < leftMin && nums[mid] < rightMin? nums[mid]: Math.min(leftMin,rightMin);
    }
}
