import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int x = 0; x < n; x++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          int a = Integer.parseInt(st.nextToken());
          int b = Integer.parseInt(st.nextToken());

          long sum = (long) (a+b) * (a+b) * (a+b-1) / 2;

          sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
        
    }
}
