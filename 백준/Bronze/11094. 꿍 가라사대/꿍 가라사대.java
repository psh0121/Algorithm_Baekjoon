import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < n; i++) {
      String[] str = sc.nextLine().split(" ");

      if(str[0].equals("Simon") && str[1].equals("says")) {
        for(int j = 2; j < str.length; j++) {
          System.out.print(" " + str[j]);
        }
        System.out.println();
      }

    }
		sc.close();
    }
}
