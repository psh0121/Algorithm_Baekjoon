import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String s = sc.next();
    HashMap<String, String> map = new HashMap<>();
    map.put("A", "a");
    map.put("B", "v");
    map.put("E", "ye");
    map.put("K", "k");
    map.put("M", "m");
    map.put("H", "n");
    map.put("O", "o");
    map.put("P", "r");
    map.put("C", "s");
    map.put("T", "t");
    map.put("Y", "u");
    map.put("X", "h");

    String result = "";

    for(int i = 0; i < s.length(); i++) {
      result += map.get(Character.toString(s.charAt(i)));
    }

    System.out.println(result);
		sc.close();
    }
}
