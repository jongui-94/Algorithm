package algo230126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2468 {
    static int n,rain,cnt,max;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX<0 || newX>n-1 || newY<0 || newY>n-1) {
                continue;
            }
            if(!visited[newX][newY] && arr[newX][newY] > rain){
                dfs(newX,newY);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        max = 0;
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                }
            }
        }
        ArrayList<Integer> store = new ArrayList<>();
        for(int k=0;k<=max;k++) {
            for(int i=0;i<n; i++) {
                for(int j=0; j<n; j++) {
                    rain = k;
                    if(!visited[i][j] && arr[i][j] > rain) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            store.add(cnt);
            cnt = 0;
            visited = new boolean[n][n];
        }
        Collections.sort(store,Collections.reverseOrder());
        System.out.println(store.get(0));

    }
}
