import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String s = br.readLine();

		String result = "";

		for(int i = 0; i < str.length(); i++) {
			String val = Character.toString(str.charAt(i));

			if(s.contains(val)) {
				result += (char)((int)val.charAt(0) + 32);
			}
			else {
				result += val;
			}
		}

		System.out.println(result);
    }
}