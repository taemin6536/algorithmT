
class Solution {
    public int solution(int[] num_list) {
        int count = 0;

        for (final int j : num_list) {
            int innerCount = 0;
            int num = j;

            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                    innerCount++;
                } else {
                    num--;
                    num /= 2;
                    innerCount++;
                }
            }

            count += innerCount;
        }
        return count;
    }
}