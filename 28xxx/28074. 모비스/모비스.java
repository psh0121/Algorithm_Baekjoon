import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] mobis = {"M", "O", "B", "I", "S"};
		String result = "YES";
		
		for(int i = 0; i < mobis.length; i++) {
			if(!str.contains(mobis[i])) {
				result = "NO";
				break;
			}
		}
		
		System.out.println(result);
	}
}