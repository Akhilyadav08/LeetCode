class Solution {
    public void sortColors(int[] nums) {
        // Taking three variables just like three pointers for swaping and comparing
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){

            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    
    }
    // Creating a swap function just to make code readable or to avoid swap again and again.
         public void swap(int[] nums,int i, int j){
            int temp=0;
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}