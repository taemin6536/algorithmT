
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long count = 0;
        for (long p = 5; p <= N; p *= 5) {
            count += N / p;   // 5의 배수, 25의 배수, 125의 배수 ... 500 / 5 = 100, 500 / 25 = 20, 500 / 125 = 4
        }
        System.out.println(count);

    }

}