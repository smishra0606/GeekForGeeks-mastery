class Solution {
    public int solve(int b, List<Integer> arr) {
        // code here
        int result=b;
        for(int num : arr){
            if(result==num){
                result=result*2;
            }
        }
        return result;
    }
}