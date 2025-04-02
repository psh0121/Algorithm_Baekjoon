import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();

    if(str.contains("bigdata") || str.contains("public") || str.contains("society")) {
      System.out.println("public bigdata");
    }
    else System.out.println("digital humanities");
		sc.close();
    }
}
