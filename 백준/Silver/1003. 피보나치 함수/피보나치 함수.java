import java.util.List;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static List<Integer> zero = new ArrayList<>();
    public static List<Integer> one = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        zero.add(1);
        zero.add(0);
        zero.add(1);
        one.add(0);
        one.add(1);
        one.add(1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_time = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_time; i++) {
            fibo(Integer.parseInt(br.readLine()));
        }
    }

    public static void fibo(int num) {
        int size = zero.size();
        if (num >= size) {
            for (int i = size; i <= num; i++) {
                zero.add(zero.get(i - 1) + zero.get(i - 2));
                one.add(one.get(i - 1) + one.get(i - 2));
            }
        }
        System.out.printf("%d %d\n", zero.get(num), one.get(num));
    }
}