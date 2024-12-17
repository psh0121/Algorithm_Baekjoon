import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
    ArrayList<Integer> list = new ArrayList<>();
    String result = "";

    while (true) {
      int num = 0;
      for(int i = 0; i < n.length(); i++) {
        char letter = n.charAt(i);
        int numLetter = Character.getNumericValue(letter);

        num += numLetter * numLetter;
      }

      if(num == 1) {
        result = "HAPPY";
        break;
      }
      else {
        if(list.contains(num)) {
          result = "UNHAPPY";
          break;
        }
        else {
          list.add(num);
          n = Integer.toString(num);
        }
      }
    }

    System.out.println(result);
		sc.close();
    }
}
