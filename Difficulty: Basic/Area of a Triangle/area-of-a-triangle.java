class Solution {
    public double findArea(int a, int b, int c) {
        // code here
        if(a+b<=c || b+c<=a || c+a<=b){
            return 0.0;
        }
        double n=(a+b+c)/2.0;
        double result=Math.sqrt(n*(n-a)*(n-b)*(n-c));
         return ((long)(result*1000))/1000.0;
    }
}