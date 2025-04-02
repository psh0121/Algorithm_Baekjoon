import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
          String str = sc.nextLine();
          if(str.equals("#")) break;
          String result = "";

          for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(letter == ' ') result += "%20";
            else if(letter == '!') result += "%21";
            else if(letter == '$') result += "%24";
            else if(letter == '%') result += "%25";
            else if(letter == '(') result += "%28";
            else if(letter == ')') result += "%29";
            else if(letter == '*') result += "%2a";
            else result += letter;
          }

          System.out.println(result);
        }
        sc.close();
    }
}