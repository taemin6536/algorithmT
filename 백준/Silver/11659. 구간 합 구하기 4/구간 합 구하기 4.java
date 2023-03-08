import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//배열 갯수
        int m = sc.nextInt();//횟수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sumArray = new int[arr.length+1];
        sumArray[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            sumArray[i] = sumArray[i-1] + arr[i-1];
        }

        for (int j = 0; j < m; j++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int result = sumArray(start, end, sumArray);
            System.out.println(result);
        }

    }

    static int sumArray(int start, int end, int[] sumArray){
        return sumArray[end] - sumArray[start-1];
    }
}
