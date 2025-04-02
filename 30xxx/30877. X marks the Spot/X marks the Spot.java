import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'x' || s.charAt(j) == 'X') {
                    result.append(Character.toUpperCase(t.charAt(j)));
                    break;
                }
            }
        }

        
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}