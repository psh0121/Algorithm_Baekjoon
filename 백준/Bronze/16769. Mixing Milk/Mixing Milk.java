import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long c1 = sc.nextLong();
    long m1 = sc.nextLong();

    long c2 = sc.nextLong();
    long m2 = sc.nextLong();

    long c3 = sc.nextLong();
    long m3 = sc.nextLong();

    // 1: 1->2
    // 2: 2->3
    // 3: 3->1
    int turn = 1;

    for(int i = 1; i <= 100; i++) {
      if(turn == 1) {
        if(m1 + m2 > c2) {
          m1 = (m1 + m2) - c2;
          m2 = c2;
        }
        else {
          m2 = m1 + m2;
          m1 = 0;
        }
        turn = 2;
      }
      else if(turn == 2) {
        if(m2 + m3 > c3) {
          m2 = (m2 + m3) - c3;
          m3 = c3;
        }
        else {
          m3 = m2 + m3;
          m2 = 0;
        }
        turn = 3;
      }
      else {
        if(m3 + m1 > c1) {
          m3 = (m3 + m1) - c1;
          m1 = c1;
        }
        else {
          m1 = m3 + m1;
          m3 = 0;
        }
        turn = 1;
      }
    }

    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);

		sc.close();
    }
}
