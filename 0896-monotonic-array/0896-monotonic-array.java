class Solution {
    public boolean isMonotonic(int[] nums) {
        // these are for checking contine increase or decrease
        Boolean increase=true;
        Boolean decrease=true;
        //  loop for traversing on nums
        for(int i=0;i<nums.length-1;i++){
            // this condition checks continous increase like 1,2,2,4...
            if(nums[i]<nums[i+1]){
                decrease=false; // if not continue then decrease=false
            }
            // this condition checks continous decrease like 4,3,3,2...
            else if(nums[i]>nums[i+1]){
                increase=false;// if not continue then increase=false
            }
        }
        //    if both false  then false
        return increase||decrease;
    }
}