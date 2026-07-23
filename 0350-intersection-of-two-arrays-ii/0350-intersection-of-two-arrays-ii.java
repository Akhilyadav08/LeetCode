import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // inbuilt function for shorting thr given aarays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        // creating new arrays for storing output 
        int[] out=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                out[k]=nums1[i];
                k++;
                i++;
                j++;
            }
        }
        // It returns the exact needed part of array int[] arrays
        return Arrays.copyOf(out,k);
    }
}