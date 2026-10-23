class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        // This loop is for outer array 
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            // for the array that is inside the outer array 
            for(int j=0;j<accounts[i].length;j++){
                // Here we find the sum of array of array
                sum=sum+accounts[i][j];
            }
            // Here we will have a max value and another will be sum
            //  bigger one will go to max and next sum will come 
            max=Math.max(max,sum);
        }

        return max;
    }
}