import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 컴퓨터
        int q = Integer.parseInt(st.nextToken());

        Set<Integer> virusComputers = new HashSet<>();

        for(int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int computer = 0;

            if(num == 1) {
                computer = Integer.parseInt(st.nextToken());

                if(!virusComputers.contains(computer)) {
                    virusComputers.add(computer);
                }
            }
            else if(num == 2) {
                computer = Integer.parseInt(st.nextToken());

                if(virusComputers.contains(computer)) {
                    virusComputers.remove(computer);
                }
            }
            else {
                bw.write((n - virusComputers.size()) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
