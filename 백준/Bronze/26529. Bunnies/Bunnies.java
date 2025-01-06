import java.util.Scanner;

public class Main {
  public static int fifbo(int num) {
    if(num <= 1) return 1;

    int a = 1; 
    int b = 1;
    for(int i = 2; i <= num; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
          System.out.println(fifbo(sc.nextInt()));
        }
        sc.close();
    }
}