import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= n; i++) sb.append(i);

    System.out.println(sb.toString().indexOf(Integer.toString(n)) + 1);
		sc.close();
    }
}
