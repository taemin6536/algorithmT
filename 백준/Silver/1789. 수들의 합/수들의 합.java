import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        long sum = 0;
        for (long i = 0;; i++) {
            if (count > n){
                sum--;
                break;
            }
            count += i;
            sum = i;
        }
        System.out.println(sum);
    }
}
