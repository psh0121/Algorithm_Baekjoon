import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		int result = 0;

		for(int i = 0; i < n; i++) {
			String birth = sc.next();

			if(!str.contains(birth)) {
				str += birth;
				result++;
			}
		}

		System.out.println(result);
		sc.close(); 
    }
}
