class Solution {
    public boolean wordPattern(String pattern, String s) {
    //    Here we split the s in different words so we can access easily
        String[] words =s.split(" ");
        // Here we check if both length is equal then only we check further 
         if(pattern.length()!=words.length){
            return false;
         }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word=words[i];
            // If pattern like "a" are already present go to else part
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }
            else{
             // If word is already present in map return false skip to next
                if(map.containsValue(word)){
                    return false;
                }
                // If pattern and word boyh is not present put it in map
                map.put(ch,word);
            }
        }
        return true;
    }
}