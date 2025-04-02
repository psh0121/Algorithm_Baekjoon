import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gather = "aeiou";
		String str = sc.next();

		int before = 0;
		int cur = 0;

		// 모음이면 1 자음이면 0
		for(int i = 0; i < str.length(); i++) {
			if(i == 0) {
				if(gather.contains(Character.toString(str.charAt(i)))) {
					before = 1;
				}
				else before = 0;

				continue;
			}

			cur = gather.contains(Character.toString(str.charAt(i))) ? 1 : 0;

			if(before == cur) {
				System.out.println(0);
				return;
			}

			before = cur;
 		}
		System.out.println(1);
		sc.close(); 
    }
}
