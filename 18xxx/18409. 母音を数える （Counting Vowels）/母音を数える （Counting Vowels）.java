import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] vowel = {"a", "i", "u", "e", "o"};
		int len = sc.nextInt();
		String word = sc.next();
		int result = 0;
		
		for(int i = 0; i < len; i++) {
			for(String vowelEle : vowel) {
				if(vowelEle.equals(Character.toString(word.charAt(i)))) result++;
			}
		}
		
		System.out.println(result);
	}
}         
