import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		if(s.contains("gori")) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
    }
}
