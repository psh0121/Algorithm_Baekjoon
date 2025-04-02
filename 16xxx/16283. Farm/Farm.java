import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();

    int sheep = 0;
    int goat = 0;
    int solutions = 0;

    for(int x = 1; x < n; x++) {
     int y = n - x;

      if(a * x + b * y == w) {
        sheep = x;
        goat = y;
        solutions++;
      }
    }

    if(solutions == 1) System.out.println(sheep + " " + goat);
    else System.out.println(-1);
		sc.close();
    }
}
