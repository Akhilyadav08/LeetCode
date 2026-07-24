class Solution {
    public int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            // Update first maximum
            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            }

            // Update second maximum
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            }

            // Update third maximum
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        if (third == null) {
            return first.intValue();
        }

        return third.intValue();
    }
}