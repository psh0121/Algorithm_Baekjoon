import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] firend = new int[n+1];
    int[] targetArr = new int[m];
    for(int i = 0; i < targetArr.length; i++) targetArr[i] = sc.nextInt();

    for(int i = 0; i < m; i++) {
      int target = targetArr[i];
      int wrongPerseon = 0;

      for(int j = 1; j <= n; j++) {
        int num = sc.nextInt();

        if(target == num) firend[j]++;
        else wrongPerseon++;
      }

      firend[target] += wrongPerseon;
    }

    for(int i = 1; i < firend.length; i++) {
      System.out.println(firend[i]);
    }
		sc.close();
    }
}
