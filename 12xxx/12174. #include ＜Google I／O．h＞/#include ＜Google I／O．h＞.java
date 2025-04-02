import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for(int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      List<String> arr = new ArrayList<>();
      String input = sc.next();

      for(int j = 0; j < input.length(); j += 8) {
        int end = Math.min(j + 8, j + input.length());
        arr.add(input.substring(j, end));
      }

      System.out.print("Case #" + i + ": ");

      String result = "";

      for(int j = 0; j < arr.size(); j++) {
        String value = arr.get(j).replaceAll("O", "0").replaceAll("I", "1");
        int num = Integer.parseInt(value, 2);
        result += (char)num;
      }

      System.out.println(result);
    }
		sc.close();
    }
}
