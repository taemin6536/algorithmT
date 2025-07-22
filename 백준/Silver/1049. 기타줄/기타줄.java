
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int minPackagePrice = 1001;
        int minUnitPrice = 1001;

        for (int i = 0; i < M; i++) {
            int packagePrice = sc.nextInt();
            int unitPrice = sc.nextInt();

            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minUnitPrice = Math.min(minUnitPrice, unitPrice);
        }

        long cost1 = (long) N * minUnitPrice;

        long cost2 = (long) minPackagePrice * ((N+5) / 6);

        long cost3 = (long) minPackagePrice * (N/6) + (long) minUnitPrice * (N%6);

        System.out.println(Math.min(cost3,Math.min(cost1, cost2)));
        sc.close();
    }

}
