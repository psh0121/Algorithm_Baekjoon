import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int idx = 0;
		int result = 0;
		
		while(idx <= str.length() - 4) {
			if(str.substring(idx, idx + 4).equals("DKSH")) {
				result++;
				idx += 4;
			}
			else idx++;
		}
		
		System.out.println(result);
	}
}         