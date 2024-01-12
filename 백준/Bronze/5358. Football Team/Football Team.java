import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		String result = "";
		
		while(true) {
			name = br.readLine();
			result = "";
			
			if(name == null) break;
			
			for(int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == 'e') result += 'i';
				else if(name.charAt(i) == 'E') result += 'I';
				else if(name.charAt(i) == 'i') result += 'e';
				else if(name.charAt(i) == 'I') result += 'E';
				else result += name.charAt(i);
			}
			
			System.out.println(result);
		}
	}
}         
