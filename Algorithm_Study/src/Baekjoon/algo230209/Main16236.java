package algo230209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main16236 {
    static int n,time,size,eat;
//    static int index;
    static int[][] arr;
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,-1,1,0};
    static Queue<Point> queue = new LinkedList<>();
//    static ArrayList<Integer> store = new ArrayList<>();
    static Point babyshark;
    static void bfs() {
        while(!queue.isEmpty()) {
            if(!isPossible()){
                queue.clear();
                return;
            }
            Point a = queue.poll();
            for(int i=0; i<4; i++) {
                int newX = a.x + dx[i];
                int newY = a.y + dy[i];
                System.out.println("새로운 지점 "+ newX + " " + newY);
                if(newX<0 || newX>n-1 || newY<0 || newY >n-1) {
                    continue;
                }
                if(arr[newX][newY] > size){
                    continue;
                }
                if(arr[newX][newY] < size && arr[newX][newY] > 0){
                    int move = Math.abs(newX-babyshark.x) + Math.abs(newY- babyshark.y);
                    time += move;
//                    System.out.println(move);
                    babyshark = new Point(newX,newY);
                    System.out.println("아기상어 뚜루루 "+babyshark.x + " " + babyshark.y);
                    eat++;
                    arr[newX][newY] = 0;
                    if(size == eat) {
                        size++;
                        eat = 0;
                    }
                    queue.clear();
                    queue.offer(babyshark);
//                    index++;
                    return;
                }
                queue.offer(new Point(newX,newY));


            }
        }
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        time = 0;
        eat = 0;
        size = 2;
//        index = 0;

        for(int i=0; i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
//                if(arr[i][j] > 0) {
//                    store.add(arr[i][j]);
//                }
                if(arr[i][j] == 9) {
                    babyshark = new Point(i,j);
                    arr[i][j] = 0;
                }
            }
        }
//        Collections.sort(store);
        queue.offer(babyshark);
        if(!isPossible()) {
            System.out.println(0);
        }
        else {
            while (!queue.isEmpty()) {
                bfs();
            }
        }
        System.out.println(time);

    }
    static class Point {
        int x,y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
