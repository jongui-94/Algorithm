package algo230119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1260 {
    static int n,m,v;
    static int[][] arr;
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        arr = new int[n+1][n+1];

        for(int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        //dfs
        visited[v] = true;
        System.out.print(v + " ");
        dfs(v);
        System.out.println();

        //bfs
        visited = new boolean[n+1];
        visited[v] = true;
        bfs(v);

    }
    static void dfs(int v) {
        for(int i =0; i<n+1; i++) {
            if(!visited[i] && arr[v][i] == 1) {
                System.out.print(i + " ");
                visited[i] = true;
                dfs(i);
            }
        }
    }
    static void bfs(int v) {
        queue.add(v);
        visited[v] = true;
        System.out.print(v + " ");

        while(!queue.isEmpty()) {
            int now = queue.poll();
            for(int i =1; i<n+1; i++) {
                if(!visited[i] && arr[now][i] == 1) {
                    System.out.print(i + " ");
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();

    }
}
