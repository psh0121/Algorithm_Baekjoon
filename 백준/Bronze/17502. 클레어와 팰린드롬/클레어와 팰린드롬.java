import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] str = sc.next().split("");

    for(int i = 0; i < n / 2; i++) {
      String start = str[i];
      String end = str[str.length - 1 - i];

      if(start.equals("?") && end.equals("?")) {
        str[i] = "a";
        str[str.length - 1 - i] = "a";
      }
      else if(!start.equals("?")) {
        str[str.length - 1 - i] = start;
      }
      else {
        str[i] = end;
      }
    }

    if(n % 2 == 1 && str[n/2].equals("?")) {
      str[n/2] = "a";
    }

    System.out.println(String.join("", str));
		sc.close();
    }
}
