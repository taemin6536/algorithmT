
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new TreeSet<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer i : set) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}