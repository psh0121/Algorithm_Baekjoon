import java.util.Scanner;

public class Main {
  public static boolean isPrime (int num) {
    boolean result = true;

    for(int i = 3; i <= Math.sqrt((double)num); i++) {
      if(num % i == 0) {
        result = false;
        break;
      }
    }
    return result;
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int newNumber = number + (sc.nextInt() * 1000000);

    boolean numberPrime = isPrime(number);
    boolean newNumberPrime = isPrime(newNumber);

    System.out.println(numberPrime && newNumberPrime ? "Yes" : "No");
		sc.close();
    }
}
