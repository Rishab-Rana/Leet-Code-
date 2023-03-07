class Solution {
    public int removeDuplicates(int[] nums) {
    int head=0,current=0,count=1;
      for(int i=0;i<nums.length;i++){
      if(nums[head]!=nums[current]){
          head++;
          nums[head]=nums[current];
          current++;
          count++;
      }
      else{
          current++;
      }
      }
      return count;
}
}