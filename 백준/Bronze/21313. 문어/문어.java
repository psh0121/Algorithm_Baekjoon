import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String result = "";

    if(n % 2 == 0) result += "1 2 ".repeat(n/2);
    else result += "1 2 ".repeat(n/2) + "3";

    System.out.println(result.trim());
		sc.close();
    }
}
