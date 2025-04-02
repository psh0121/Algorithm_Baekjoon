import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int miles = 0;
    while (sc.hasNext()) {
      String str = sc.nextLine();
      if(str.equals("0")) {
        System.out.println(miles);
        miles = 0;
        continue;
      }
      if(str.equals("#")) break;

      String[] info = str.split(" ");
      int distance = Integer.parseInt(info[2]);
      String flyClass = info[3];

      if(flyClass.equals("F")) {
        miles += distance * 2;
      }
      else if(flyClass.equals("B")) {
        if(distance % 2 == 0) miles += distance + (distance / 2);
        else miles += distance + (distance / 2) + 1;
      }
      else {
        if(distance <= 500) miles += 500;
        else miles += distance;
      }
    }
		sc.close();
    }
}
