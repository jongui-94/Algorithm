package algo230216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main1715 {
    static int n;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static void permutation(int cnt) {
        if(cnt==n) {
            if(n==1) {
                pq.add(0);
            }
            else if(n==2) {
                pq.add(result[0]+result[1]);
            }
            else if(n>2){
                int card = 0;
                int comp = 0;
                card = result[0] + result[1];
                comp += card;
                for(int i=2; i<n; i++) {
                    card += + result[i];
                    comp += card;
                }
                pq.add(comp);
                return;
            }

        }
        for(int i=0; i<n; i++) {
            if(visited[i]) {
                continue;
            }
            result[cnt] = arr[i];
            visited[i] = true;
            permutation(cnt+1);
            visited[i] = false;

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        permutation(0);
        System.out.println(pq.poll());

    }
}
