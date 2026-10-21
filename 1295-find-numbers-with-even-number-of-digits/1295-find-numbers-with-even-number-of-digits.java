class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
// Here the elements of nums get converted in string and then we find the   length of the element
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}