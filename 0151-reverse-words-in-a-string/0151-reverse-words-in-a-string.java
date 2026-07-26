class Solution {
    public String reverseWords(String s) {
      // This is use to remove extra space from start and end at same in space in b/w
      //   And also cconvert string to array 
        String[] arr =s.trim().split("\\s+");
      // These are three different variable for swaping 
        int i=0;
        int j =arr.length-1;
        String temp = null;
      // Swaping logic
        while(i<j){
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }
      // Again converting to string to array
        String str=String.join(" ",arr);
        return str;  
    }
}