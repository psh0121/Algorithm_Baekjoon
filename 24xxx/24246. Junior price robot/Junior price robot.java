import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i = 1; i < n; i++) {
            if(arr[i] <= arr[0]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("infinity");
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
    }
}
