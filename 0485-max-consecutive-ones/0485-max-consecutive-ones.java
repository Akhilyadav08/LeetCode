class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        int maxcount =0;
        while(i<nums.length){
            // IF 1 THEN WE HAVE TO INCREASE COUNT
            if(nums[i]==1){
                count++;
                i++;
            }
            // IF 0 THEN WE HAVE TO MAKE COUNT=0 , MOVE TO NEXT AND WE MUST HAVE WHICH IS BIGGER MAXCOUNT OR COUNT
            else if(nums[i]==0){
                maxcount=Math.max(count,maxcount);
                count=0;
                i++;
                continue;
            }
        }
        // THIS TRACKS IF AFTER THE COMPLETE PROGRAM IF CHECK IS AGAIN BIGGER SO HERE WE CHEK IT AGAIN EX;-11101111 
      if(count>maxcount){
        maxcount=count;
      }  
      return maxcount;
    }
}