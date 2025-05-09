import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void solve (BufferedReader br) throws IOException{
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] sX = br.readLine().split(" ");
            String[] sY = br.readLine().split(" ");

            int[] x = new int[n];
            int[] y = new int[n];

            for(int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(sX[i]);
                y[i] = Integer.parseInt(sY[i]);
            }

            int maxDistance = 0;

            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    if(y[j] >= x[i]) {
                        int distance = j - i;

                        maxDistance = Math.max(maxDistance, distance);
                    }
                }
            }

            System.out.print("The maximum distance is " + maxDistance +"\n\n");
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
        br.close();
    }
}
