class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Creating a new array for storing alphabet from a to z
        int[] count= new int[26];

        // Counting every character of magazine 
        for(int i=0;i<magazine.length();i++){
            count[magazine.charAt(i)-'a']++;
        }
        // Using character of ransomNote
        for(int i=0;i<ransomNote.length();i++){
            count[ransomNote.charAt(i)-'a']--;
        
            // Checking if count becomes negative then magazine did't exist
            if(count[ransomNote.charAt(i)-'a']<0){
                return false;
              }
        }
        return true;
    }
}