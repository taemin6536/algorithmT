import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            int j;
            for (j = 2; j <= list.get(i) ; j++) {
                if (list.get(i)%j==0){
                    break;
                }
            }
            if (list.get(i)==j){
                sum += 1;
            }
        }
        System.out.println(sum);

    }
}
