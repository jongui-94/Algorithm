package algo230117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15654 {
    static int n,m;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        arr = new int[n];
        result = new int[m];
        visited = new boolean[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++) {
            int a = Integer.parseInt(st1.nextToken());
            arr[i] = a;
        }
        Arrays.sort(arr);
        magic(0);
        System.out.println(sb.toString());
    }
    static void magic(int cnt) {
        if(cnt == m) {
            for(int i = 0; i<m; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<n; ++i) {
            if(visited[i]) {
                continue;
            }
            result[cnt] = arr[i];
            visited[i] = true;
            magic(cnt +1);
            visited[i] = false;
        }
    }
}
