import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] plane = {"0145", "0123", "2367", "4567", "0246", "1357"};
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
          int[] value = new int[4];
          for(int j = 0; j < 4; j++) value[j] = sc.nextInt();
          Arrays.sort(value);

          StringBuilder sb = new StringBuilder();
          for(int number : value) sb.append(number);

          String compareValue = sb.toString();

          boolean isPlane = false;

          for(int j = 0; j < 6; j++) {
            if(plane[j].equals(compareValue)) {
              isPlane = true;
              break;
            }
          }

          System.out.println(isPlane ? "YES" : "NO");
        }
        sc.close();
    }
}
