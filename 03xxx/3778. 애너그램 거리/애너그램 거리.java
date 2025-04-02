import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    
    for(int i = 1; i <= n; i++) {
      StringBuilder sb = new StringBuilder();
      sb.append("Case #" + i + ": ");

      String str1 = sc.nextLine();
      String str2 = sc.nextLine();

      if(str1.length() == 0 || str2.length() == 0) {
        sb.append(str1.length() + str2.length());
      }
      else {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        for(int j = 0; j < list1.size(); j++) {
          String letter = list1.get(j);
          if(list2.contains(letter)) {
            list2.set(list2.indexOf(letter), "0");
            list1.set(j, "0");
          }
        }

        int cnt = 0;

        for(int j = 0; j < list1.size(); j++) {
          if(list1.get(j) != "0") cnt++;
        }
        for(int j = 0; j < list2.size(); j++) {
          if(list2.get(j) != "0") cnt++;
        }

        sb.append(cnt);
      }

      System.out.println(sb.toString());
    }
		sc.close();
    }
}
