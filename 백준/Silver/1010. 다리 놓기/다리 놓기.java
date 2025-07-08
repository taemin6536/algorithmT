import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 받기 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        // 여러 테스트 케이스의 출력을 한 번에 처리하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스만큼 반복
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            // N, M 입력 (서쪽 사이트 개수, 동쪽 사이트 개수)
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // dp 테이블 생성 및 초기화
            // dp[i][j]는 동쪽 j개 중 i개를 뽑는 경우의 수 (M C N)
            // 크기는 (N+1) x (M+1)로 설정
            int[][] dp = new int[N + 1][M + 1];

            // DP 테이블 채우기
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    // i가 j보다 크면 다리를 지을 수 없으므로 경우의 수는 0입니다.
                    // 루프 조건(j>=i) 때문에 이 경우는 자동으로 처리됩니다.

                    // 베이스 케이스: i=1인 경우 (j개 중 1개 뽑기)
                    if (i == 1) {
                        dp[i][j] = j;
                        continue;
                    }
                    
                    // 베이스 케이스: i==j인 경우 (j개 중 j개 뽑기)
                    if (i == j) {
                        dp[i][j] = 1;
                        continue;
                    }

                    // 점화식 적용
                    // dp[i][j] = dp[i][j-1] (j번째를 안뽑는 경우) + dp[i-1][j-1] (j번째를 뽑는 경우)
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }

            // 최종 결과를 StringBuilder에 추가
            sb.append(dp[N][M]).append('\n');
        }

        // 모든 결과를 한 번에 출력
        System.out.print(sb);
    }
}