import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str;
		int cnt = 0;
		char val;
		
		while(true) {
			str = (br.readLine()).toLowerCase();
			cnt = 0;
			
			if(str.equals("#")) break;
			
			for(int i = 0; i < str.length(); i++) {
				val = str.charAt(i);
				
				if(val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u') {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
}         
