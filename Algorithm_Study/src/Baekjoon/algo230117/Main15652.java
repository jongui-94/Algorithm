package algo230117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15652 {
    static int n,m;
    static int[] arr;
    static int[] result;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        arr = new int[n];
        result = new int[m];
        for(int i =0; i<n; i++) {
            arr[i] = i+1;
        }
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
            if(cnt>0){
                if(result[cnt-1] > arr[i]){
                    continue;
                }
            }
            result[cnt] = arr[i];
            magic(cnt +1);
        }
    }
}
