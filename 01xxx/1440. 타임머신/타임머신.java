import java.util.Scanner;

public class Main {
  public static boolean isTime(String a, String b, String c) {
    boolean result = false;
    int h = Integer.parseInt(a);
    int m = Integer.parseInt(b);
    int s = Integer.parseInt(c);

    if((h >= 1 && h <= 12) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
      result = true;
    }
    return result;
  }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String[] time = sc.next().split(":");
    String a = time[0];
    String b = time[1];
    String c = time[2];

    int result = 0;

    if(isTime(a, b, c)) result++;
    if(isTime(a, c, b)) result++;
    if(isTime(b, c, a)) result++;
    if(isTime(b, c, a)) result++;
    if(isTime(c, a, b)) result++;
    if(isTime(c, b, a)) result++;

    System.out.println(result);
		sc.close();
    }
}
