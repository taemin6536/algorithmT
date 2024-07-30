import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[sc.nextInt()]; // 주소값 0 1 2 3 4
        int cnt = sc.nextInt();

        for (int l = 0; l < cnt; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int m = i; m <= j; m++) {
                arr[m - 1] = k;

            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }
}

