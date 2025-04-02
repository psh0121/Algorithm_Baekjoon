import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());

			if(value > 0 && (value & (value - 1)) == 0) System.out.println(1);
			else System.out.println(0);
		}
    }
}