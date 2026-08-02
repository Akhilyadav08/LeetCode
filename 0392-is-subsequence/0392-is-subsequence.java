class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        // If s is empty it is already a subsequence of t
        if(s.length()==0){
            return true;
        }
        while(j<t.length()){
            // If both are equal go to next index and return true when the length of s becomes equal to i
             if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                if(i==s.length()){
                    return true;
                }
             }
            //  If i is not equal to index of j just increase the index of j
             else{
                j++;
            }
        }
         return false;
    }
}