
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //합 배열 만들기@
        // 일반배열 5 4 3 2 1
//        int[] arr = new int[]{5,4,3,2,1};
//        int[] sumArray = new int[arr.length];
//        sumArray[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            sumArray[i] = sumArray[i-1] + arr[i];
//        }
//        System.out.println(Arrays.toString(sumArray));
        /*
         * 구간 i~j 의 합이 N이 되야함
         * N=15 예를들어, Sum[j] - Sum[i-1] 구간의합공식
         * sum[i] = sum[i-1] + arr[i]
         * 15 =
         * */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//재료의 갯수 6
        int M = sc.nextInt();//재료의 두가지의 합이 됐을떄 성공인 수 9
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 1 2 3 4 5 7
        int i = 0; //Min
        int j = N-1; // Max

        while(i < j){
            if (arr[i]+arr[j] < M){
                i++;
            }else if (arr[i]+arr[j] > M ){
                j--;
            }else {
                count++;
                i++;j--;
            }
        }
        System.out.println(count);

    }
}
