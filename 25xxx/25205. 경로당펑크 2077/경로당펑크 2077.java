import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    String consonant = "qwertasdfgzxcv";  // 자음
    String lastLetter = Character.toString(str.charAt(str.length() - 1));

    System.out.println(consonant.contains(lastLetter) ? 1 : 0);
		sc.close();
    }
}
