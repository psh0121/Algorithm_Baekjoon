import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++) {
      StringBuilder miSB = new StringBuilder();
      for(int j = 0; j < n; j++) {
        String num = sc.next();
        miSB.append((num + " ").repeat(k));
      }

      for(int j = 0; j < k; j++) {
        sb.append(miSB.toString().trim()).append("\n");
      }
    }

    System.out.println(sb.toString().trim());
		sc.close();
    }
}
