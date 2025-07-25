class Solution {
    public int solution(int a, int b) {
        int reducedB = b / gcd(a, b);

        while (reducedB % 2 == 0) {
            reducedB /= 2;
        }
        while (reducedB % 5 == 0) {
            reducedB /= 5;
        }

        if (reducedB == 1) {
            return 1;
        } else {
            return 2;
        }
    }
        
    public int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}