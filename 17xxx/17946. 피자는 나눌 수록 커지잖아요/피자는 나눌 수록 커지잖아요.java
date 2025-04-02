import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
    // 풀이)
    // pizza: k번의 칼질로 만들어질수있는 피자의 최대조각수
    // give: 상납해야할 피자조각수
    //     k     |      pizza      |      give
    //     1     |        2        |        1
    //     2     |      2+(2)      |       1+2
    //     3     |     2+(2+3)     |      1+2+3
    //     4     |    2+(2+3+4)    |     1+2+3+4
    //    ...    |       ...       |       ...
    //     k     | 2+(2+3+4+...+k) |   1+2+3+...+k
    
    // k번의 칼질로 주인공이 먹을수 있는 피자의 수는 pizza - give 이다.
    // 그렇기때문에 언제나 1조각밖에 못먹는다.

    // 공식)
    // pizza = 2 + (k*(k+1)/2-1)
    //       = 2 + (K^2+k-2)/2
    //       = (k^2+k+2)/2
    // give = (k*(k+1))/2
    //      = (k+k^2)/2
    // pizza - give = 1
    
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int k = sc.nextInt();
      System.out.println(1);
    }

		sc.close();
    }
}
