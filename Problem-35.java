class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length-1;
        
        for(int i=0;i<=size;i++){
            if(target==nums[i])
            {
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
            else if(target>nums[size]){
                return size+1;
            }
        }
        return size;
    }
}