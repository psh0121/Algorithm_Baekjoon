import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int w = n;
    int h = n;

    int c = sc.nextInt();

    for(int i = 0; i < c; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(a >= h || b >= w) continue;

      // 가로면적, 세로면적
      int wCutS = w * a;
      int hCutS = h * b;

      if(hCutS > wCutS) w = b;
      else h = a;
    }

    System.out.println(w * h);
		sc.close();
    }
}
