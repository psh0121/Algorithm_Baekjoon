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
    	int nextNum = 1;
    	int cnt = 0;
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(num != nextNum) cnt++;
    		else nextNum++;
    	}
    	
    	bw.write(cnt + "\n");
    	bw.flush();
    	br.close();
    }
}