class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1;i>=0;i--){
            // HERE WE CHECK DIGITS LIKE 178,345 AND SOO ON
             if(digits[i]<9){
                digits[i]++;
                return digits;
             }
            //  IF DIGITS ARE CONTAING 9 IN THEM MAKE THEM 0
             else{
                digits[i]=0;
             }
        }    
        // HERE WE HAVE CREATED A NEW ARRAY SO WE CAN STORE THE ASWER OF DIGITS LIKE 999 , 99 AND SO ON
       int[] answer= new int[digits.length+1];
           answer[0]=1;  
           return answer;
    }
    
}