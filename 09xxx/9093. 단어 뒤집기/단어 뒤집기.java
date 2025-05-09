import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] arr = br.readLine().split(" ");

            for(int i = 0; i < arr.length; i++) {
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }

            System.out.println(String.join(" ", arr));
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
        br.close();
    }
}
