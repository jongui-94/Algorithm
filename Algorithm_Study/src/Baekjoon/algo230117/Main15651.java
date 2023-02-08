package algo230117;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15651 {
    static int n,m;
    static int[] arr;
    static int[] result;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[m];
        for(int i = 0; i<n; i++) {
            arr[i] = i+1;
        }

        magic(0);
        System.out.println(sb.toString()    );
    }

    static void magic(int cnt) {
        if(cnt == m) {
            for(int i = 0; i< cnt; i++) {
                sb.append(result[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i<n; ++i) {
            result[cnt] = arr[i];
            magic(cnt+1);
        }
    }
}
