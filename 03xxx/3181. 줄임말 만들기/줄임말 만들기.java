import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String[] trash = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
    String[] str = sc.nextLine().split(" ");
    String result = "";

    for(int i = 0; i < str.length; i++) {
      String element = str[i];

      if(i == 0) {
        result += Character.toString(element.charAt(0)).toUpperCase();
      }
      else {
        boolean isInclude = false;

        for(int j = 0; j < trash.length; j++) {
          if(trash[j].equals(element)) {
            isInclude = true;
            break;
          }
        }

        if(!isInclude) result += Character.toString(element.charAt(0)).toUpperCase();
      }
    }

    System.out.println(result);
		sc.close();
    }
}
