import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        // This is the first logic which will work
        // int i=0;
        // int j=1;
        // int out=0;
        // while(j<nums.length){
        //     out += Math.min(nums[i],nums[j]);
        //     i+=2;
        //     j+=2;
        // }
        // return out;

        // Here is second logic quit better than the first one
        
        // this we use because there is no need of Math.min function and we can directly acces i and same output we get as last one
        int i=0;
        int out=0;
        for(i=0;i<nums.length;i+=2){
            out +=nums[i];
        }
        return out;
    }
}