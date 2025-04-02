import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int[] arr = new int[n+1];
    for(int i = 1; i < arr.length; i++) arr[i] = sc.nextInt();

    for(int i = 0; i < q; i++) {
      int query = sc.nextInt();
      long result = (long) 0;

      if(query == 1) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j = a; j <= b; j++) {
          result += (long)arr[j];
        }

        int arrA = arr[a];
        int arrB = arr[b];

        arr[a] = arrB;
        arr[b] = arrA;

      }
      else {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        long sumAB = (long)0;
        long sumCD = (long)0;

        for(int j = a; j <= b; j++) {
          sumAB += (long)arr[j];
        }
        for(int j = c; j <= d; j++) {
          sumCD += (long)arr[j];
        }

        result = sumAB - sumCD;
      }

      System.out.println(result);
    }
		sc.close();
    }
}
