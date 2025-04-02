import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.next().split("");
		String[] str2 = sc.next().split("");
		
		String result = "";
		
		for(int i = 0; i < str1.length; i++) {
			result += Math.max(Integer.parseInt(str1[i]), Integer.parseInt(str2[i]));
		}
		
		System.out.println(result);
	}
}         