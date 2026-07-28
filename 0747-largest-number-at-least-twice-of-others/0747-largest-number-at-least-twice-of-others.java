class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int secmax=0;
        int index=0;
        // This is use to find max and index of max 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        // This is use to find secmax 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && nums[i]>secmax){
                secmax=nums[i];
            }
        }
        // Here is the complete logic
        if(max>= 2*secmax){
            return index;
        }
        else{
            return -1;
        }
    }
}