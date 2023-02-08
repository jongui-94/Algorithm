package algo230118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main15664 {
    static int n,m;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb;
    static StringBuilder sb2;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[m];
        visited = new boolean[n];
        sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);
        magic(0);
        System.out.println(sb.toString());
    }
    static void magic(int cnt) {
        if(cnt==m) {
            sb2 = new StringBuilder();
            for(int i =0; i<cnt; ++i) {
                sb2.append(result[i] + " ");
            }
            if(!set.contains(sb2.toString())){
                sb.append(sb2.toString());
                sb.append("\n");
                set.add(sb2.toString());
            }
            return;
        }
        for(int i =0; i<n; ++i) {
            if(visited[i]){
                continue;
            }
            if(cnt>0) {
                if(result[cnt-1] > arr[i]) {
                    continue;
                }
            }
            result[cnt] = arr[i];
            visited[i] = true;
            magic(cnt+1);
            visited[i] = false;
        }
    }
}
