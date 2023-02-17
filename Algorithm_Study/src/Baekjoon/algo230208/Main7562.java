package algo230208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main7562 {
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<Point> queue;
    static int[] dx = {1,2,-1,-2,-1,-2,1,2};
    static int[] dy = {2,1,2,1,-2,-1,-2,-1};
    static Point start,goal;
    static void bfs() {
        while(!queue.isEmpty()) {
            Point a = queue.poll();
            for(int i=0;i<8;i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                if(newX<0 || newX>n-1 || newY<0 || newY>n-1) {
                    continue;
                }
                if(visited[newX][newY]) {
                    continue;
                }
                queue.add(new Point(newX,newY));
                visited[newX][newY] = true;
                arr[newX][newY] = arr[a.x][a.y] +1;
                if(newX == goal.x && newY == goal.y) {
                    return;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i< tc; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            visited = new boolean[n][n];


            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            visited[x][y] = true;
            start = new Point(x,y);

            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            goal = new Point(x,y);

            queue = new LinkedList<>();
            queue.add(start);

            bfs();
            System.out.println(arr[goal.x][goal.y]);
        }
    }
    static class Point{
        int x,y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
