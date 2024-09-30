import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.equals("(1)")) System.out.println(0);
		else if (s.equals("1)(") ||
				s.equals(")(1") ||
				s.equals("()1") ||
				s.equals("1()")
		) {
			System.out.println(1);
		}
		else System.out.println(2);
		sc.close();
    }
}
