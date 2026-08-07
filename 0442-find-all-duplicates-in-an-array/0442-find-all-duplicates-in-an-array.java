class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
       
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){//if present in set then add it in list
                list.add(nums[i]);//dublicate get added in list
            }
            else{
                set.add(nums[i]);// if it is not in set then add in set
            }
        }
        return list;
    }
}