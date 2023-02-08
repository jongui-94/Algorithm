package algo230126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10026 {
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int cnt,n;
    static char now;

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int newX = x +dx[i];
            int newY = y +dy[i];
            if(newX<0 || newX>n-1 || newY<0 || newY>n-1) {
                continue;
            }
            if(!visited[newX][newY] && arr[newX][newY] == now) {
                dfs(newX,newY);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        visited = new boolean[n][n];
        cnt = 0;
        for(int i =0; i<n; i++) {
            String s = br.readLine();
            for(int j =0; j<n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i=0;i<n; i++) {
            for(int j=0;j<n;j++) {
                now = arr[i][j];
                if(!visited[i][j]) {
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        System.out.print(cnt+" ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j] == 'R') {
                    arr[i][j] = 'G';
                }
            }
        }
        cnt = 0;
        visited = new boolean[n][n];
        for(int i=0;i<n; i++) {
            for(int j=0;j<n;j++) {
                now = arr[i][j];
                if(!visited[i][j]) {
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        System.out.print(cnt);

    }
}
