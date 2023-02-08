package algo230201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1987 {
    static int n,m,cnt,max;
    static char[][] arr;
    static boolean[] visited = new boolean[26];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static void dfs(int x,int y,int cnt) {
        visited[arr[x][y]-'A'] = true;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX<0 || newX > n-1 || newY <0 || newY >m-1) {
                continue;
            }
            if(!visited[arr[newX][newY]-'A']){
                dfs(newX,newY,cnt+1);
            }
        }
        visited[arr[x][y]-'A'] = false;
        max = Math.max(max,cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        max=0;

        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        dfs(0,0,1);
        System.out.println(max);
    }
}
