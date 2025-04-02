import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = sc.nextInt();
    int d = sc.nextInt();

    int sumAB = a + b;
    int sumCD = c + d;

    int cur = 1;

    for(int i = 1; i < sumAB; i++) {
      cur++;
      if(cur == 5) cur = 1;
    }

    for(int i = 1; i < sumCD; i++) {
      cur++;
      if(cur == 5) cur = 1;
    }

    System.out.println(cur);
		sc.close();
    }
}
