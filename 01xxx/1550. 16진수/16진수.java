import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int result = Integer.parseInt(val, 16);

		System.out.println(result);
		sc.close();
    }
}
