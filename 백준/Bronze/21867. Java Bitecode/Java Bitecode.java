import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    String replaceStr = str.replaceAll("[JAV]", "");

    System.out.println(replaceStr.length() == 0 ? "nojava" : replaceStr);
		sc.close();
    }
}
