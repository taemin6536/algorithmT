import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[12];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4; // 1+1+1, 1+2, 2+1, 3

            int n = sc.nextInt();
            for (int j = 4; j <= n ; j++) {
                    dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);

        sc.close();
    }
}
