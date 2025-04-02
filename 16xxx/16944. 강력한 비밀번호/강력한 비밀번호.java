import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String pw = sc.next();
    int cnt = 0;

    boolean containNum = false;
    boolean containSmallAlpha = false;
    boolean containBigAlpha = false;
    boolean containSpecial = false;

    for(int i = 0; i < n; i++) {
      String letter = Character.toString(pw.charAt(i));

      if("0123456789".contains(letter)) containNum = true;
      else if("abcdefghijklmnopqrstuvwxyz".contains(letter)) containSmallAlpha = true;
      else if("abcdefghijklmnopqrstuvwxyz".toUpperCase().contains(letter)) containBigAlpha = true;
      else if("!@#\\$%\\^&\\*\\(\\)\\-\\+".contains(letter)) containSpecial = true;
    }

    if(!containNum) cnt++;
    if(!containSmallAlpha) cnt++;
    if(!containBigAlpha) cnt++;
    if(!containSpecial) cnt++;

    if(pw.length() + cnt < 6) cnt += 6 - (pw.length() + cnt);

    System.out.println(cnt);
		sc.close();
    }
}
