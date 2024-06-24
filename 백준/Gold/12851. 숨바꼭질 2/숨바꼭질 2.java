import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int min = Integer.MAX_VALUE;
    static int max = 100000;
    static boolean[] visited = new boolean[max + 1];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        bfs();
        System.out.println(min);
        System.out.println(cnt);
    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            visited[node.x] = true;
            if (node.x == k) {
                min = Math.min(min, node.time);
                if (min == node.time) cnt++;
            }

            if (node.x * 2 <= max && !visited[node.x * 2]) {
                q.offer(new Node(node.x * 2, node.time + 1));
            }
            if (node.x + 1 <= max && !visited[node.x + 1]) {
                q.offer(new Node(node.x + 1, node.time + 1));
            }
            if (node.x - 1 >= 0 && !visited[node.x - 1]) {
                q.offer(new Node(node.x - 1, node.time + 1));
            }
        }
    }

    public static class Node {
        int x;
        int time;

        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}