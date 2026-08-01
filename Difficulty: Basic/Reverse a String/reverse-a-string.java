class Solution {
    public static String reverseString(String s) {
        // code here
        char[] result=s.toCharArray();
        
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char c=result[left];
            result[left]=result[right];
            result[right]=c;
            left++;
            right--;
        }
        return new String(result);
    }
}