class Solution {
    public static String solution(int[] n, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftLocation = 10;
        int rightLocation = 12;

        for (int num : n) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                leftLocation = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightLocation = num;
            } else { // 2 5 8 0
                int leftDist = getDist(leftLocation, num);
                int rightDist = getDist(rightLocation, num);
                if (leftDist > rightDist) {
                    sb.append("R");
                    rightLocation = num;
                } else if (leftDist < rightDist) {
                    sb.append("L");
                    leftLocation = num;
                } else { // 두 거리가 같을때.
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftLocation = num;
                    }else {
                        sb.append("R");
                        rightLocation = num;
                    }
                }

            }
        }


        return sb.toString();
    }

    private static int getDist(int location, int num) {
        if (num == 0 ){
            num = 11;
        }
        if (location == 0){
            location = 11;
        }

        int locationX = (location-1)/3;
        int locationY = (location-1)%3;

        int numX = (num-1)/3;
        int numY = (num-1)%3;

        return Math.abs(locationX-numX)+Math.abs(locationY-numY);
    }
}