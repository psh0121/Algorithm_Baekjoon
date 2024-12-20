import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int k = 0;
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      if(arr[i] == -1) k = i;
    }

    // 왼쪽
    int left = Integer.MAX_VALUE;
    for(int i = 0; i < k; i++) {
      left = Math.min(left, arr[i]);
    }

    // 오른쪽
    int right = Integer.MAX_VALUE;
    for(int i = k+1; i < n; i++) {
      right = Math.min(right, arr[i]);
    }

    System.out.println(left + right);

		sc.close();
    }
}
