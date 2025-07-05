import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

//            System.out.println(findRyoojaemyeongLocation(x1, y1, r1, x2, y2, r2));
            sb.append(findRyoojaemyeongLocation(x1, y1, r1, x2, y2, r2)).append("\n");
        }
        System.out.println(sb);
        br.close();
       
    }

    private static int findRyoojaemyeongLocation(final int x1, final int y1, final int r1, final int x2, final int y2, final int r2) {
        // 두 원의 중심 간 거리의 제곱
        // Math.pow 대신 (x2-x1)*(x2-x1)를 사용하면 부동 소수점 오차를 피할 수 있습니다.
        int distanceSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double distance = Math.sqrt(distanceSquared); // 실제 거리

        if (distance == 0) {
            if (r1 == r2) { // 반지름도 같으면 무한대
                return -1;
            } else { // 반지름이 다르면 만나지 않음
                return 0;
            }
        }
        // 2. 두 원의 중심이 다른 경우

        // 2-1. 두 원이 외접하는 경우 (한 점에서 만남)
        // distance == r1 + r2
        // 부동 소수점 오차를 고려하여 (r1+r2)^2 == distanceSquared 로 비교하는 것이 안전합니다.
        // 하지만 문제 조건에서 정수만 주어지므로, 일반적인 경우 Math.abs를 이용한 근사값 비교를 사용합니다.
        // 또는 여기서는 r1, r2도 정수이므로 단순 합 비교 가능.
        if (distance == r1 + r2) {
            return 1;
        }
        // 2-2. 두 원이 내접하는 경우 (한 점에서 만남)
        // distance == |r1 - r2|
        // 마찬가지로 부동 소수점 오차 고려: distanceSquared == (|r1-r2|)^2
        // Math.abs(r1 - r2) 대신 제곱을 이용하면 더 정확합니다.
        // (r1 - r2) * (r1 - r2) == distanceSquared
        else if (distance == Math.abs(r1 - r2)) {
            return 1;
        }
        // 2-3. 두 원이 두 점에서 만나는 경우
        // |r1 - r2| < distance < r1 + r2
        // 제곱으로 비교: (|r1-r2|)^2 < distanceSquared < (r1+r2)^2
        else if (Math.abs(r1 - r2) < distance && distance < r1 + r2) {
            return 2;
        }
        // 2-4. 두 원이 만나지 않는 경우
        // d > r1 + r2 (외부에서 떨어짐)
        // d < |r1 - r2| (내부에서 포함하지만 만나지 않음)
        else {
            return 0;
        }
    }
}
