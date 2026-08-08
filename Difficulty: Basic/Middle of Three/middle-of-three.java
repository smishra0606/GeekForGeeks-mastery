class Solution {
    int middle(int a, int b, int c) {
        // code here
        if((a>b && a<c) || (a>c && a<b)){
            return a;
        }
        else if((a<b && b<c) || (b>c && a>b)){
            return b;
        }
        else{
            return c;
        }
    }
}