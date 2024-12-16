import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String h = sc.next();
		String n = sc.next();
		int result = 0;

		for(int i = 0; i <= h.length() - n.length(); i++) {
			String str = h.substring(i, n.length() + i);

			if(n.equals(str)) result++;
		}

		System.out.println(result);
		sc.close();
    }
}
