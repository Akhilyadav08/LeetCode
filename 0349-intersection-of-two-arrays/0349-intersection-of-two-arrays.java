import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
    // in this we takes the min of nums1 and nums2 and create new array of that size
        int[] ans=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            // most important partt of logic
            else{
                if(k==0||ans[k-1]!=nums1[i]){
                    ans[k]=nums1[i];
                    k++;
                }
                i++;
                j++;
            }
        }
     // here we create a copy of ans and in that we just takes k elements in Output
       return Arrays.copyOf(ans,k); 
    }
}