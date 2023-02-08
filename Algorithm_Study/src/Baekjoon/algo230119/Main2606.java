package algo230119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2606 {
    static int n,m,cnt;
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        cnt=0;

        for(int i = 0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        visited[1] = true;
        dfs(1);
        System.out.println(cnt);
    }

    static void dfs(int start) {
        for(int i=1; i<n+1; i++) {
            if(!visited[i] && arr[start][i] == 1){
                cnt++;
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
