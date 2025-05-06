import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= t; i++) {
            String[] parts = br.readLine().split(" ");
            String n = parts[0];
            int x = Integer.parseInt(parts[1]);
            int mod = 0;

            for(int j = 0; j < n.length(); j++) {
                mod += n.charAt(j) - '0';
                mod %= x;
                if(j != n.length() - 1)mod *= 10;
            }

            mod %= x;

            sb.append("Case ").append(i).append(": ").append(mod).append("\n");
        }

        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
        br.close();
    }
}
