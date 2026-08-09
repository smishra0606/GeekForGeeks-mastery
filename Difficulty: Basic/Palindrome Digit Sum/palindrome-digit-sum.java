class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
        }
        int tempsum=sum;
        int pal=0;
        while(tempsum>0){
            int last=tempsum%10;
            pal=pal*10+last;
            tempsum=tempsum/10;
        }
        return pal==sum;
        
        
    }
}