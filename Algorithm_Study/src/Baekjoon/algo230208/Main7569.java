package algo230208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7569 {
    static int[][][] arr;
    static int m,n,h,cnt,max;
    static boolean[][][] visited;
    static int[] dx = {0,1,0,-1,0,0};
    static int[] dy = {1,0,-1,0,0,0};
    static int[] dz = {0,0,0,0,1,-1};
    static Queue<Point> queue = new LinkedList<Point>();
    static void bfs() {
        while(!queue.isEmpty()){
            Point a = queue.poll();
                for(int j=0; j<6; j++) {
                    int newX = a.x + dx[j];
                    int newY = a.y + dy[j];
                    int newZ = a.z + dz[j];
                    if(newX<0 || newX>n-1 || newY<0 || newY>m-1 || newZ <0 || newZ > h-1) {
                        continue;
                    }
                    if(visited[newZ][newX][newY]) {
                        continue;
                    }
                    if(arr[newZ][newX][newY] == -1 || arr[newZ][newX][newY] == 1) {
                        continue;
                    }
                    queue.add(new Point(newX,newY,newZ));
                    visited[newZ][newX][newY] = true;
                    arr[newZ][newX][newY] = arr[a.z][a.x][a.y] + 1;
                    cnt--;
                    if(arr[newZ][newX][newY] >= max) {
                        max = arr[newZ][newX][newY];
                    }
                }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        cnt = 0;
        max = -1;
        arr = new int[h][n][m];
        visited = new boolean[h][n][m];

        for(int i =0; i<h;i++){
            for(int j=0;j<n;j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<m;k++){
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if(arr[i][j][k] == 1) {
                        queue.add(new Point(j,k,i));
                    }
                    else if(arr[i][j][k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        if(cnt == 0) {
            System.out.println(0);
        }
        else {
            bfs();
            if(cnt != 0) {
                System.out.println(-1);
            }
            else {
                System.out.println(max-1);
            }
        }


    }
    static class Point {
        int x;
        int y;
        int z;
        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
