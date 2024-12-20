import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      if(n == 0) break;
      int p = sc.nextInt();

      int start = 1;
      int end = n;
      for(int i = 0; i < n/4; i++) {
        int one = start;
        int two = start + 1;
        int three = end - 1;
        int four = end;

        if(one == p || two == p || three == p || four == p) {
          if(one == p) System.out.println(two + " " + three + " " + four);
          else if(two == p) System.out.println(one + " " + three + " " + four);
          else if(three == p) System.out.println(one + " " + two + " " + four);
          else System.out.println(one + " " + two + " " + three);
          break;
        }
        else {
          start += 2;
          end -= 2;
        }
      }
    }
		sc.close();
    }
}
