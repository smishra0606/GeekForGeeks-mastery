class Solution {
    public static int findgcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd=findgcd(a,b);
        int lcm=(a*b)/gcd;
        return new int[]{lcm,gcd};
    }
}