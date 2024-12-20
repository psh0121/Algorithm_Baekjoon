import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxNum = 0;

    for(int i = 0; i < n; i++) {
      String str = sc.next();
      int forCnt = 0;
      int whileCnt = 0;

      if(str.length() >= 3) {
        for(int j = 0; j <= str.length() - 3; j++) {
          if(str.substring(j, j+3).equals("for")) forCnt++;
        }
      }

      if(str.length() >= 5) {
        for(int j = 0; j <= str.length() - 5; j++) {
          if(str.substring(j, j+5).equals("while")) whileCnt++;
        }
      }

      maxNum = Math.max(maxNum, forCnt+whileCnt);
    }

    System.out.println(maxNum);
		sc.close();
    }
}
