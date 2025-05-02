import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());
    BigInteger c = new BigInteger(sc.next());
    BigInteger calABC = a.multiply(b.multiply(c));
    String abc = calABC.toString();

    int[] arr = new int[10];
    for(int i = 0; i < abc.length(); i++) {
      char num = abc.charAt(i);
      arr[Character.getNumericValue(num)]++;
    }

    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
		sc.close();
    }
}
