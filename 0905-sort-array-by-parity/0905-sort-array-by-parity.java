class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            // Left is odd and right is even so swap
            if(nums[i]%2!=0 && nums[j]%2==0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            // Check weather right is already even so move to next
            else if(nums[i]%2==0){
                    i++;
                }
            // Checkif left is already even so decrease and go to next
            else{
                  j--;
               
                }
        }
        return nums;
    }
}