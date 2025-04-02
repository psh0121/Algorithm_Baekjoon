import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

    for(int i = 1; i <= m; i++) {
      for(int j = 0; j < n-1; j++) {
        int left = arr[j];
        int right = arr[j+1];

        if(left % i > right % i) {
          int temp = left;

          left = right;
          right = temp;
        }

        arr[j] = left;
        arr[j+1] = right;
      }
    }

    for(int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
		sc.close();
    }
}
