import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

    int[] vote = new int[n];

    for(int i = 0; i < m; i++) {
      int base = sc.nextInt();
      int idx = 0;

      for(int j = 0; j < arr.length; j++) {
        if(arr[j] <= base) {
          idx = j;
          break;
        }
      }

      vote[idx]++;
    }

    int maxValue = 0;
    int maxIdx = 0;

    for(int i = 0; i < vote.length; i++) {
      if(vote[i] > maxValue) {
        maxValue = vote[i];
        maxIdx = i;
      }
    }

    System.out.println(maxIdx + 1);
		sc.close();
    }
}
