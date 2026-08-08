class Solution {
    public boolean isPower(int x, int y) {
        if (y == 1) return true;
        if (x == 0 || x == 1) return x == y;
        
        if (y < x) return false;
        
        while (y % x == 0) {
            y = y / x;
        }
        
        return y == 1;
    }
}