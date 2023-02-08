package algo230202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main7576 {
    static int n,m;
    static int max,cnt;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static Queue<Point> queue = new LinkedList<Point>();
    static ArrayList<Point> list = new ArrayList<Point>();
    static void bfs() {
        while(!queue.isEmpty()) {
            Point a = queue.poll();
            for(int i=0; i<4; i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                if(newX<0 || newX>n-1 || newY<0 || newY>m-1) {
                    continue;
                }
                if(arr[newX][newY] == -1 || arr[newX][newY] == 1) {
                    continue;
                }
                if(visited[newX][newY]) {
                    continue;
                }
                queue.add(new Point(newX,newY));
                visited[newX][newY] = true;
                arr[newX][newY] = arr[a.x][a.y] +1;
                cnt--;
                if(arr[newX][newY] >= max) {
                    max = arr[newX][newY];
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        max = 0;
        cnt = 0;

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    queue.add(new Point(i,j));
                }
                else if(arr[i][j] == 0) {
                    cnt++;
                }
            }
        }
        if(cnt ==0) {
            System.out.println(0);
        }
        else{
            bfs();
            if(cnt==0) {
                System.out.println(max-1);
            }
            else {
                System.out.println(-1);
            }
        }
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
