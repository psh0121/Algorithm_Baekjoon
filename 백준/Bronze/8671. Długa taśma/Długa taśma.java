import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        // 가장 작은값이 답이다.
        int minNum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            minNum = Math.min(minNum, Integer.parseInt(strArr[i]));
        }

        System.out.printf("%d.00\n", minNum);

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
        br.close();
    }
}
