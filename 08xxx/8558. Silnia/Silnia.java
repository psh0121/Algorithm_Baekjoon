import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "1";
		
		for(int i = 1; i <= num; i++) {
			result = Integer.toString(Integer.parseInt(result) * i);
			result = Character.toString(result.charAt(result.length() - 1));
		}
		
		System.out.println(result);
	}
}         
