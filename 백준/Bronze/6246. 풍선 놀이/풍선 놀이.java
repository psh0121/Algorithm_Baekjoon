import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] slot = new int[n+1];
    for(int i = 1; i < slot.length; i++) slot[i] = i;

    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int space = sc.nextInt();

      for(int j = l; j < slot.length; j+=space) {
        slot[j] = 0;
      }
    }

    int cnt = 0;

    for(int i = 0; i < slot.length; i++) {
      if(slot[i] != 0) cnt++;
    }

    System.out.println(cnt);
		sc.close();
    }
}
