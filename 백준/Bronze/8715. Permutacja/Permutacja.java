import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String solve(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[n+1];

        String[] tokens = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(tokens[i]);

            if(num < 1 || num > n || visited[num]) {
                return "NIE";
            }

            visited[num] = true;
        }

        return "TAK";
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solve(br));
    }
}
