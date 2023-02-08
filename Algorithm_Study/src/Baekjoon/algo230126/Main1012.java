package algo230126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1012 {
    static int[][] arr;
    static int m,n,k;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt;

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newX = x +dx[i];
            int newY = y +dy[i];
            if(newX < 0 || newX > n-1 || newY <0 || newY > m-1) {
                continue;
            }
            if(!visited[newX][newY] && arr[newX][newY] == 1) {
                dfs(newX,newY);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i< tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            visited = new boolean[n][m];
            cnt = 0;
            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[b][a] = 1;
            }
            for(int c=0; c<n; c++) {
                for(int d=0; d<m; d++) {
                    if(arr[c][d] == 1 && !visited[c][d]){
                        dfs(c,d);
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);

        }


    }
}
