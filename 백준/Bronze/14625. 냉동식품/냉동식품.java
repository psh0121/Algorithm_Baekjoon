import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int sH = sc.nextInt();
    int sM = sc.nextInt();
    int eH = sc.nextInt();
    int eM = sc.nextInt();
    int n = sc.nextInt();

    int cnt = 0;

    while (true) {
      String strSH = String.format("%02d", sH);
      String strSM = String.format("%02d", sM);
      if(
        strSH.contains(Integer.toString(n)) ||
        strSM.contains(Integer.toString(n))
        ) {
          cnt++;
        }

        if(sH == eH && sM == eM) break;

        sM++;

        if(sM == 60) {
          sH++;
          sM = 0;
        }
    }

    System.out.println(cnt);
		sc.close();
    }
}
