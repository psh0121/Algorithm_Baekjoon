import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int idx = sc.nextInt() - 1;
			String str = sc.next();
			String result = "";

			for(int j = 0; j < str.length(); j++) {
				if(j == idx) continue;

				result += str.charAt(j);
			}

			System.out.println(result);
		}
		sc.close();
    }
}
