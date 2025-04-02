import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		if(s.length() > n) System.out.println("Impossible");
		else {
			int cnt = 0;

			for(int i = 0; i < s.length(); i++) {
				char letter = s.charAt(i);
				int cube = (int)letter - 96;
				cnt += cube;
			}

			System.out.println(cnt);
		}
		sc.close();
    }
}
