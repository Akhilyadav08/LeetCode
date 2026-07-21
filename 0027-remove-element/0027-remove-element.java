class Solution {
    public void swap(int[] nums,int i, int j){
        //  int i=0;
        // int j=nums.length-1;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[j]==val){
                j--;
            }
            else if(nums[i]==val){
                swap(nums,i,j);
            }
            else{
                i++;
            }
        }
      return j+1;  
    }
}