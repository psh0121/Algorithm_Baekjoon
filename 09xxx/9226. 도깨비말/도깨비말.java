import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (true) {
      String str = sc.next();
      if(str.equals("#")) break;
      
      if(str.contains("a") || str.contains("e") || str.contains("i") ||
      str.contains("o") || str.contains("u")) {
        if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || 
        str.charAt(0) == 'o' || str.charAt(0) == 'u') System.out.println(str + "ay");
        else {
          String[] arr = str.split("");
          List<String> arrayList = new ArrayList<>(Arrays.asList(arr));

          while (true) {
            if("aeiou".contains(arrayList.get(0))) break;

            String first = arrayList.remove(0);
            arrayList.add(first);
          }

          System.out.println(String.join("", arrayList) + "ay");
        }
      }
      else {
        System.out.println(str + "ay");
      }
    }
		sc.close();
    }
}
