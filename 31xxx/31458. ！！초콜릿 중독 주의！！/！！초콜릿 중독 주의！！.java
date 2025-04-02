import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int m = Integer.parseInt(sc.nextLine());
    for(int k = 0; k < m; k++) {
      String s = sc.nextLine();
      int left = 0;
      int right = 0;
      boolean leftFlag = true;

      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '!' && leftFlag) left++;
        else if(s.charAt(i) == '!' && !leftFlag) right++;
        else leftFlag = false;
      }

      int result = s.contains("0") ? 0 : 1;
      result = right == 0 ? result : 1;

      for(int j = 0; j < left; j++) {
        result = result == 1 ? 0 : 1;
      }

      System.out.println(result);
    }
		sc.close();
    }
}
