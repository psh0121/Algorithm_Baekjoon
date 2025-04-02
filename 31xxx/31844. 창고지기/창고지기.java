import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int robotIdx = str.indexOf("@");
    int boxIdx = str.indexOf("#");
    int targetIdx = str.indexOf("!");

    if(robotIdx < boxIdx && boxIdx < targetIdx) {
      System.out.println(targetIdx - robotIdx - 1);
    }
    else if(targetIdx < boxIdx && boxIdx < robotIdx) {
      System.out.println(robotIdx - targetIdx - 1);
    }
    else System.out.println(-1);
		sc.close();
    }
}
