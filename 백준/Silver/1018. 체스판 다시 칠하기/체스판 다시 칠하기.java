import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static char[][] board;
    public static int min_val = 64; // 다시 칠하는 횟수의 최댓값은 8*8=64

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        // 보드 정보 입력받기
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        // 8x8 체스판을 자를 수 있는 모든 시작점 (i, j)을 순회
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 해당 시작점에서 만들어지는 체스판의 최소 수정 횟수를 찾음
                findMinRepaints(i, j);
            }
        }

        System.out.println(min_val);
    }

    /**
     * (x, y)를 시작점으로 하는 8x8 체스판의 최소 수정 횟수를 찾아
     * 전역 최솟값(min_val)을 갱신하는 메소드
     */
    public static void findMinRepaints(int x, int y) {
        int repaintCount = 0;

        // 기준이 되는 첫 번째 칸의 색깔
        char firstColor = 'W';

        // case 1: 맨 왼쪽 위 칸이 'W'일 경우
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {

                // 올바른 색깔이 아닐 경우 카운트 증가
                if (board[i][j] != firstColor) {
                    repaintCount++;
                }

                // 다음 칸은 색깔이 바뀌어야 함
                firstColor = (firstColor == 'W') ? 'B' : 'W';
            }
            // 다음 줄의 첫 칸은 이전 줄의 첫 칸과 색이 달라야 함
            firstColor = (firstColor == 'W') ? 'B' : 'W';
        }

        // 'W'로 시작하는 경우와 'B'로 시작하는 경우 중 최솟값을 선택
        // (B로 시작하는 경우의 수정 횟수 = 64 - W로 시작하는 경우의 수정 횟수)
        repaintCount = Math.min(repaintCount, 64 - repaintCount);

        // 기존의 최솟값과 현재 계산된 최솟값을 비교하여 더 작은 값으로 갱신
        min_val = Math.min(min_val, repaintCount);
    }
}