import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if(str.length() < 5) System.out.println("not cute");
    else {
      String cutStr = str.substring(str.length() - 5);

      System.out.println(cutStr.equals("driip") ? "cute" : "not cute");
    }
		sc.close();
    }
}
