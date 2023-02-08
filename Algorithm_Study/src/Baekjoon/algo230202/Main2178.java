package algo230202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main2178 {
    static int n,m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static Queue<Point> queue = new LinkedList<Point>();
    static void bfs(int x, int y) {
        queue.add(new Point(x,y));
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            Point a = queue.poll();
            for(int i=0;i<4;i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                if(newX<0 || newX>n-1 || newY <0 || newY>m-1){
                    continue;
                }
                if(visited[newX][newY]){
                    continue;
                }
                if(arr[newX][newY] == 0) {
                    continue;
                }
                queue.add(new Point(newX,newY));
                visited[newX][newY] = true;
                arr[newX][newY] = arr[a.x][a.y] +1;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i<n; i++) {
            String s = br.readLine();
            for(int j = 0; j<m; j++) {
                arr[i][j] = s.charAt(j)-'0';
            }
        }

        bfs(0,0);
        System.out.println(arr[n-1][m-1]);




    }
    static class Point{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }
}
