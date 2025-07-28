
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 빠른 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. 좌표를 저장할 2차원 배열
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            points[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        // 3. 정렬 (람다식을 이용한 Comparator 구현)
        Arrays.sort(points, (p1, p2) -> {
            // y좌표가 같다면 x좌표로 비교
            if (p1[1] == p2[1]) {
                return p1[0] - p2[0];
            }
            // y좌표가 다르면 y좌표로 비교
            return p1[1] - p2[1];
        });

        // 4. 빠른 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}