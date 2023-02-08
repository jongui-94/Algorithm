package algo230119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main2667 {
    static int n;
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n+2][n+2];
        visited = new boolean[n+2][n+2];
        for(int i = 1; i<n+1; i++) {
            String line = br.readLine();
            for(int j = 1; j<n+1; j++) {
                arr[i][j] = line.charAt(j-1)-'0';
            }
        }
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 1; i<=n;i++) {
            for(int j=1; j<=n;j++) {
                if(arr[i][j] == 1 && !visited[i][j]){
                    cnt = 0;
                    dfs(i,j);
                    count.add(cnt);
                }
            }
        }
        System.out.println(count.size());
        Collections.sort(count);
        for(int i=0; i<count.size(); i++) {
            System.out.println(count.get(i));
        }
    }
    static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt++;

        for(int i = 0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(!visited[newX][newY] && arr[newX][newY] == 1) {
                dfs(newX,newY);
            }

        }
    }
}
