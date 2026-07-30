class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            // This check if number is already even move to next
            if(nums[i]%2==0){
                i+=2;
            }
            //  This check if number is already odd move to next
            else if(nums[j]%2!=0){
                j+=2;
            }
            // Both are different then swap both the numbers
            else{
                swap(nums,i,j);
                i+=2;
                j+=2;
            }
        }
        return nums;
    }
    // Swaping is done with the help of another function
     public void swap( int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}