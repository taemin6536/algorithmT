import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static long[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new long[n+1];

        for(int i=0;i<n+1;i++){
            arr[i]=-1;
        }
        arr[0]=0;
        arr[1]=1;
        System.out.println(Fib(n));
    }
    public static long Fib(int n){
        if(arr[n]==-1){
            arr[n] = Fib(n-1)+Fib(n-2);
        }
        return arr[n];
    }
}
