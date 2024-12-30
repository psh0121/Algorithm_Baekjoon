import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String s = sc.next();

    Map<String, Double> map = new HashMap<>();
    map.put("A+", 4.5);
    map.put("A", 4.0);
    map.put("B+", 3.5);
    map.put("B", 3.0);
    map.put("C+", 2.5);
    map.put("C", 2.0);
    map.put("D+", 1.5);
    map.put("D", 1.0);
    map.put("F", 0.0);

    double totalPoints = 0;
    int cnt = 0;
    
    for(int i = 0; i < s.length(); i++) {
      String grade = "" + s.charAt(i);

      if(i != s.length() - 1 && s.charAt(i+1) == '+') {
        grade += "+";
        i++;
      }

      totalPoints += map.get(grade);
      cnt++;
    }

    System.out.println(totalPoints / cnt);
		sc.close();
    }
}
