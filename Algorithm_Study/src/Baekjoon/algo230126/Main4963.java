package algo230126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4963 {
    static int w,h,cnt;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0,1,1,-1,-1};
    static int[] dy = {0,1,0,-1,1,-1,1,-1};
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0;i<8;i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX<0 || newX>h-1 || newY<0 || newY > w-1) {
                continue;
            }
            if(!visited[newX][newY] && arr[newX][newY] == 1) {
                dfs(newX,newY);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h ==0) {
                break;
            }
            arr = new int[h][w];
            visited = new boolean[h][w];
            cnt = 0;
            for(int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(!visited[i][j] && arr[i][j] == 1) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
