class Solution {
    public int smallestEvenMultiple(int n) {
        int x = 2;
        while (x > 0) {
            if (x % n == 0 && x % 2 == 0 ) {
                return x;
            }
            else {
                x = x + 2;
            }
        } 

        return 0;  
    }
}