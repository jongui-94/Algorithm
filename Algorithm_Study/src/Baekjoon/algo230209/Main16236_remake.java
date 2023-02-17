package algo230209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main16236_remake {
    static int n,time,size,eat;
    static int[][] arr;
    static boolean visited[][];
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    static Queue<Point> queue;
    static List<Point> target;
    static Point babyshark;
    static boolean bfs() {
        queue = new LinkedList<>();
        target = new ArrayList<>();
        queue.offer(babyshark);
        visited[babyshark.x][babyshark.y] = true;
        int minDist = Integer.MAX_VALUE;

        while(!queue.isEmpty()) {
            if(!isPossible()){
                queue.clear();
                return false;
            }
            Point a = queue.poll();
            int dist = a.z;
            for(int i=0; i<4; i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                int newZ = dist +1;
                //System.out.println("새로운 지점 "+ newX + " " + newY);
                if(newX<0 || newX>n-1 || newY<0 || newY >n-1 || minDist < newZ) {
                    continue;
                }
                if(arr[newX][newY] > size || visited[newX][newY]){
                    continue;
                }
                if(arr[newX][newY] < size && arr[newX][newY] != 0){
                    target.add(new Point(newX,newY));
                    minDist = newZ;
                }
                else {
                    queue.offer(new Point(newX,newY,newZ));
                }
                visited[newX][newY] = true;
            }
        }
        int targetX = Integer.MAX_VALUE;
        int targetY = Integer.MAX_VALUE;
        for(int k=0;k<target.size();k++) {
            int nowX = target.get(k).x;
            int nowY = target.get(k).y;

            if(targetX > nowX) {
                targetX = nowX;
                targetY = nowY;
            }
            else if(targetX == nowX) {
                if(targetY > nowY) {
                    targetY = nowY;
                    targetX = nowX;
                }
            }
        }
        eat++;
        time += minDist;
        babyshark = new Point(targetX,targetY);
        //System.out.println("아기상어 뚜루루 "+babyshark.x + " " + babyshark.y);
        arr[targetX][targetY] = 0;
        if(size == eat) {
            size++;
            eat = 0;
        }
        return true;
    }
    static boolean isPossible() {
        boolean result = false;
        for(int i=0; i<n; i++) {
            for(int j=0;j<n; j++) {
                if(arr[i][j] < size && arr[i][j]>0) {
                    result = true;
                }
            }
        }
        return result;
    }
    static void isInitiate() {
        for(int i=0; i<n; i++) {
            for(int j=0;j<n; j++) {
                visited[i][j] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        time = 0;
        eat = 0;
        size = 2;

        for(int i=0; i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 9) {
                    babyshark = new Point(i,j);
                    arr[i][j] = 0;
                }
            }
        }
        if(!isPossible()) {
            System.out.println(0);
        }
        else {
            while (bfs()) {
                isInitiate();
            }
        }
        System.out.println(time);

    }
    static class Point {
        int x,y,z;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.z = 0;
        }
        Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}

