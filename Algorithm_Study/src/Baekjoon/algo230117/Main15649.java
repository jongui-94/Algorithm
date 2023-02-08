package algo230117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15649 {
    static int n, m;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = i+1;
        }
        result = new int[m];
        visited = new boolean[n];
        permutation(0);
    }
    static void permutation(int cnt) {
        if(cnt == m) {
            for(int i = 0; i< cnt; i++) {
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i =0; i<n; ++i){
            if(visited[i] == true) {
                continue;
            }
            result[cnt] = arr[i];
            visited[i] = true;
            permutation(cnt+1);
            visited[i] = false;
        }
    }
}
