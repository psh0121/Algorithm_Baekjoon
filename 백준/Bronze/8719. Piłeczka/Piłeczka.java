import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		long x = Long.parseLong(st.nextToken());
    		long w = Long.parseLong(st.nextToken());
    		
    		int cnt = 0;
    		
    		while(x < w) {
    			x *= 2;
    			cnt++;
    		}
    		
    		bw.write(cnt + "\n");
    	}
    	
    	bw.flush();
    	bw.close();
    	br.close();
    }
}