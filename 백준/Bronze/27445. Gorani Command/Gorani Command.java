import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] col = new int[n];
    int[] row = new int[m];

    for(int i = 0; i < n; i++) {
      if(i != n-1) {
        col[i] = sc.nextInt();
      }
      else {
        int num = sc.nextInt();
        col[i] = num;
        row[0] = num;

        for(int j = 1; j < m; j++) {
          row[j] = sc.nextInt();
        }
      }
    }

    if(n == 1) {
      int minNum = Integer.MAX_VALUE;
      int idx = 0;

      for(int i = 0; i < m; i++) {
        if(row[i] < minNum) {
          minNum = row[i];
          idx = i;
        }
      }

      System.out.println(1 + " " + (idx+1));
    }
    else if(m == 1) {
      int minNum = Integer.MAX_VALUE;
      int idx = 0;

      for(int i = 0; i < n; i++) {
        if(col[i] < minNum) {
          minNum = col[i];
          idx = i;
        }
      }

      System.out.println((idx+1) + " " + 1);
    }
    else {
      Arrays.sort(col);
      Arrays.sort(row);

      System.out.println((n-row[0]) + " " + (col[0]+1));
    }
		sc.close();
    }
}
