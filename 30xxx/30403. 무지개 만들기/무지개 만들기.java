import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    boolean big = false;
    boolean small = false;

    if(
      str.contains("R") &&
      str.contains("O") &&
      str.contains("Y") &&
      str.contains("G") &&
      str.contains("B") &&
      str.contains("I") &&
      str.contains("V")
    ) {
      big = true;
    }

    if(
      str.contains("r") &&
      str.contains("o") &&
      str.contains("y") &&
      str.contains("g") &&
      str.contains("b") &&
      str.contains("i") &&
      str.contains("v")
    ) {
      small = true;
    }



    if(big && small) System.out.println("YeS");
    else if(big) System.out.println("YES");
    else if(small) System.out.println("yes");
    else System.out.println("NO!");
		sc.close();
    }
}
