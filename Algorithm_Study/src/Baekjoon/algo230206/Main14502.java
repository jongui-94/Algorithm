package algo230206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main14502 {
    static int r,c,length,max;
    static int[][] origin;
    static int[][] copy;
    static int[] result;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static ArrayList<Point> walls = new ArrayList<>();
    static ArrayList<Point> storeQue = new ArrayList<>();
    static Queue<Point> queue = new LinkedList<Point>();
    static void bfs() {
        while(!queue.isEmpty()) {
            Point a = queue.poll();
            for(int i=0; i<4;i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                if(newX<0 || newX>c-1 || newY<0 || newY>r-1) {
                    continue;
                }
                if(copy[newX][newY] == 1) {
                    continue;
                }
                if(visited[newX][newY]) {
                    continue;
                }
                queue.add(new Point(newX,newY));
                visited[newX][newY] = true;
                copy[newX][newY] = 2;
            }
        }
        int safeRoom = safe();
        if(safeRoom >= max) {
            max = safeRoom;
        }

    }
    static void permutation(int cnt) {
        if(cnt == 3) {
            for(int i =0; i<3; i++) {
                Point a = new Point(walls.get(result[i]).x,walls.get(result[i]).y);
                copy[a.x][a.y] = 1;
            }
            bfs();
            for(int y =0; y<c; y++) {
                for(int u=0; u<r; u++) {
                    copy[y][u] = origin[y][u];
                    visited[y][u] = false;
                }
            }
            for(int c=0; c<storeQue.size(); c++) {
                queue.add(new Point(storeQue.get(c).x,storeQue.get(c).y));
            }
            return;
        }
        for(int i=0; i<length;i++) {
            if(cnt>0) {
                if(result[cnt-1] >= i) {
                    continue;
                }
            }
            result[cnt] = i;
            permutation(cnt+1);
        }

    }
    static int safe() {
        int num =0;
        for(int i =0; i<c; i++) {
            for(int j=0; j<r; j++) {
                if(copy[i][j] == 0){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        origin = new int[c][r];
        copy = new int[c][r];
        visited = new boolean[c][r];
        result = new int[3];
        max = 0;


        for(int i=0;i<c;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<r;j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
                copy[i][j] = origin[i][j];
                if(origin[i][j] == 0) {
                    walls.add(new Point(i,j));
                }
                else if(origin[i][j] == 2) {
                    storeQue.add(new Point(i,j));
                    queue.add(new Point(i,j));
                }
            }
        }
        length = walls.size();
        permutation(0);
        System.out.println(max);

    }
    static class Point{
        int x,y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
