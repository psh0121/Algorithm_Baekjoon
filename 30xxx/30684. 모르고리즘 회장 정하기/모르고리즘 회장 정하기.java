import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for(int i = 0; i < n; i++) arr[i] = sc.next();
    Arrays.sort(arr);

    for(int i = 0; i < n; i++) {
      if(arr[i].length() == 3) {
        System.out.println(arr[i]);
        return;
      }
    }
		sc.close();
    }
}
