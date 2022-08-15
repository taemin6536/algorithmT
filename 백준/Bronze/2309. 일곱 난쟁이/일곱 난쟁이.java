
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] high = new int[9];
        int sum = 0;
        int spyA = 0, spyB = 0;

        for (int i = 0; i < high.length; i++) { 
            high[i] = sc.nextInt();
            sum += high[i]; 
        }
        Arrays.sort(high); 

        for(int a = 0; a < high.length-1; a++) { 
            for(int b = a+1; b < high.length; b++) {
                if(sum - high[a] - high[b] == 100) { 
                    spyA = a;
                    spyB = b;
                    break;
                }
            }
        }

        for(int j = 0; j < high.length; j++) { 
            if(j == spyA || j == spyB) 
                continue;
            System.out.println(high[j]);
        }
        sc.close();
    }
}
