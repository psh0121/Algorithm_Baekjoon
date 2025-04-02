import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String food = sc.next();

    int[] meOL = new int[2];
    int[] totalOL = new int[2];

    for(int i = 0; i < n; i++) {
      if(food.charAt(i) == 'O') totalOL[0]++;
      else totalOL[1]++;
    }

    for(int i = 1; i < n; i++) {
      if(food.charAt(i - 1) == 'O') meOL[0]++;
      else meOL[1]++;

      int[] youOL = {
        totalOL[0] - meOL[0],
        totalOL[1] - meOL[1]
      };

      if(meOL[0] != youOL[0] && meOL[1] != youOL[1]) {
        System.out.println(i);
        sc.close();
        return;
      }
    }

    System.out.println(-1);
		sc.close();
    }
}
