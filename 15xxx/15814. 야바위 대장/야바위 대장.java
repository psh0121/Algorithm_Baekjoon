import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String[] arr = sc.next().split("");
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      String aValue = arr[a];
      String bValue = arr[b];

      arr[a] = bValue;
      arr[b] = aValue;
    }

    System.out.println(String.join("", arr));
		sc.close();
    }
}
