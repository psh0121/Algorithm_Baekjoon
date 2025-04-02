import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int[] times = new int[8];
    String[] teams = new String[8];

    for(int i = 0; i < 8; i++) {
      String[] time = sc.next().split(":");
      String m = time[0];
      String ss = time[1];
      String sss = time[2];

      String team = sc.next();

      times[i] = Integer.parseInt(m+ss+sss);
      teams[i] = m+ss+sss + " " + team;
    }

    Arrays.sort(times);

    int[] grade = {10, 8, 6, 5, 4, 3, 2, 1};

    int red = 0;
    int blue = 0;

    for(int i = 0; i < 8; i++) {
      String value = Integer.toString(times[i]);

      for(int j = 0; j < 8; j++) {
        if(teams[j].contains(value)) {
          if(teams[j].charAt(teams[j].length() - 1) == 'R') red += grade[i];
          else blue += grade[i];
          break;
        }
      }
    }

    System.out.println(red > blue ? "Red" : "Blue");
		sc.close();
    }
}
