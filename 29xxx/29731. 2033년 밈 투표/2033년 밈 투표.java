import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String[] pledgeArr = {
				"Never gonna give you up", 
				"Never gonna let you down", 
				"Never gonna run around and desert you", 
				"Never gonna make you cry", 
				"Never gonna say goodbye",
				"Never gonna tell a lie and hurt you",
				"Never gonna stop"
		};
		
		List<String> pledgeList = new ArrayList<>(Arrays.asList(pledgeArr));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());		
		
		String str = "";
		String result = "No";
		
		for(int i = 0; i < cnt; i++) {
			str = br.readLine();
			if(!pledgeList.contains(str)) {
				result = "Yes";
				break;
			}
		}
		
		System.out.println(result);
	}
}         
