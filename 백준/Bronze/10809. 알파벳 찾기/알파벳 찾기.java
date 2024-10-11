import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] alpha = new int[26];
		for(int i = 0; i < 26; i++) alpha[i] = -1;

		String s = sc.next();

		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			int idx = (int)letter - 97;

			if(alpha[idx] == -1) alpha[idx] = i;
		}

		for(int i = 0; i < 26; i++) {
			if(i == 0) System.out.print(alpha[i]);
			else System.out.print(" " + alpha[i]);
		}
		sc.close();
    }
}
