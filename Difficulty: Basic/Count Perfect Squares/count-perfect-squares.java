class Solution {
    static int countSquares(int n) {
        // code her
        if(n<=1){
            return 0;
        }
        int count=(int)Math.sqrt(n-1);
        return count;
    }
}