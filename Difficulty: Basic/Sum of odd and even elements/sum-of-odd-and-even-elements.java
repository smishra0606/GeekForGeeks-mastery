class Solution {
    public int[] findSum(int n) {
        // Code here
        int[] result=new int[2];
        result[0]=0;
        result[1]=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                result[1]+=i;
            }
            else{
                result[0]+=i;
            }
        }
        return result;
    }
}