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
    		int n1 = Integer.parseInt(st.nextToken());
    		int n2 = Integer.parseInt(st.nextToken());
    		
    		if(n2 % n1 == 0) bw.write("TAK" + "\n");
    		else bw.write("NIE" + "\n");
    	}
    	bw.flush();
    }
}