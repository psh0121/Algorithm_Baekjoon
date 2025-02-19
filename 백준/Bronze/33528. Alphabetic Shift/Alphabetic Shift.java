import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(input + "\n");

        for(int i = 0; i < 25; i++) {
            StringBuilder sb = new StringBuilder();

            for(char c : input.toCharArray()) {
                if(c == ' ') sb.append(' ');
                else {
                    int cAscii = (int)c;
                    if(cAscii == 65) cAscii = 91;

                    cAscii--;

                    sb.append((char)cAscii);
                }
            }
            input = sb.toString();
            bw.write(input + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
