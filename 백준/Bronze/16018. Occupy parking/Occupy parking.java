import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String parking1 = sc.next();
		String parking2 = sc.next();
		int result = 0;

		for(int i = 0; i < n; i++) {
			char before = parking1.charAt(i);
			char after = parking2.charAt(i);

			if(before == 'C' && (before == after)) result++;
		}

		System.out.println(result);
		sc.close();
    }
}
