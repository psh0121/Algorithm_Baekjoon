import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    // 분 계산 - 분은 6도씩 이동하는데 6으로 나누어떨어지지 않는 것은 잘못된것
    if(n2 % 6 != 0) {
      System.out.println("X");
      return;
    }

    int m = n2 / 6;
    double h = (m * 0.5) + ((n1 / 30) * 30);

    if(n1 == h) System.out.println("O");
    else System.out.println("X");
		sc.close();
    }
}
