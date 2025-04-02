import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		// 16진수
		if(x.length() > 2 && x.charAt(0) == '0' && x.charAt(1) == 'x') {
			System.out.println(Integer.parseInt(x.substring(2), 16));
		}
		// 8진수
		else if(x.length() > 1 && x.charAt(0) == '0') {
			System.out.println(Integer.parseInt(x, 8));
		}
		// 10진수
		else System.out.println(x);
		sc.close();
    }
}
