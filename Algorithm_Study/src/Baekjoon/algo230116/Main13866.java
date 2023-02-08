package algo230116;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13866 {
    static int total, team1, team2, result = 0;
    static int min;
    static int[] arr;
    static int[] select;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[4];
        select = new int[2];
        visited = new boolean[4];
        for(int i = 0; i<4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        min = 10000;
        algo(0);
        System.out.println(min);

    }
    static void algo(int cnt) {
        if(cnt == 2) {
            team1 = select[0] + select[1];
            team2 = total - team1;
            if(team1>=team2){
                result = team1 - team2;
            }
            else{
                result = team2 - team1;
            }
            if(result < min) {
                min = result;
            }
            return;
        }
        for(int i = 0; i< 4; ++i) {
            if(visited[i])
                continue;
            select[cnt] = arr[i];
            visited[i] = true;
            algo(cnt +1);
            visited[i] = false;
        }
    }
}
