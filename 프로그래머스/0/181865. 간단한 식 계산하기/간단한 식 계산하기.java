class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");

        int a = Integer.parseInt(s[0]);
        String op = s[1];
        int b = Integer.parseInt(s[2]);

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return 0;

        }
    }
}