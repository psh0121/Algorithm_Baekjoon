import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] arr = new double[n];
    for(int i = 0; i < n; i++) arr[i] = sc.nextDouble();

    Arrays.sort(arr);

    System.out.printf("%.2f",arr[1]);
		sc.close();
    }
}
