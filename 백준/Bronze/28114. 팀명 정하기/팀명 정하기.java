import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int p1 = sc.nextInt();
    int y1 = sc.nextInt();
    String s1 = sc.next();

    int p2 = sc.nextInt();
    int y2 = sc.nextInt();
    String s2 = sc.next();

    int p3 = sc.nextInt();
    int y3 = sc.nextInt();
    String s3 = sc.next();

    int[] years = {y1 % 100, y2 % 100, y3 % 100};
    Arrays.sort(years);
    System.out.println("" + years[0] + years[1] + years[2]);

    int[] problems = {p1, p2, p3};
    Arrays.sort(problems);

    String result = "";
    String a = Character.toString(s1.charAt(0));
    String b = Character.toString(s2.charAt(0));
    String c = Character.toString(s3.charAt(0));

    if(problems[2] == p1) {
      if(problems[1] == p2) {
        result += a + b + c;
      }
      else {
        result += a + c + b;
      }
    }
    else if(problems[2] == p2) {
      if(problems[1] == p1) {
        result += b + a + c;
      }
      else {
        result += b + c + a;
      }
    }
    else {
      if(problems[1] == p1) {
        result += c + a + b;
      }
      else {
        result += c + b + a;
      }
    }

    System.out.println(result);
		sc.close();
    }
}
