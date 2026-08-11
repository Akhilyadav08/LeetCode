class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            char current =chars[i];
            int j=i;
            //counting using j and later we store it in other way in count
            while(j<chars.length&&chars[j]==current){
                j++;
            }
            int count=j-i;
            chars[index++]=current;//This add the character to the output
            if(count>1){
            // this is for adding the no of count of a charater in the output
                String s = String.valueOf(count);
                for(char c:s.toCharArray()){
                    chars[index++]=c;
                }
            }
            i=j;//going to next charater for counting it
        }
        return index;
    }
}