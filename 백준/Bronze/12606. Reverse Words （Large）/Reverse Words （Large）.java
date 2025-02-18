import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");

            System.out.print("Case #" + i + ": ");
            for(int j = words.length - 1; j >= 0; j--) {
                System.out.print(words[j]);

                if(j > 0) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
