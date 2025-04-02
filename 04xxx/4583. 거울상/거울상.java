import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String mirror = "bdpqiovwx";

    while (true) {
      String str = sc.next();
      if(str.equals("#"))break;
      boolean isContinue = false;
      String result = "";

      for(int i = 0; i < str.length(); i++) {
        String letter = Character.toString(str.charAt(i));

        if(mirror.contains(letter)) {
          switch (letter) {
            case "b":
              result += "d";
              break;
            case "d":
              result += "b";
              break;
            case "p":
              result += "q";
              break;
            case "q":
              result += "p";
              break;
            default:
              result += letter;
              break;
          }
        }
        else {
          isContinue = true;
          break;
        }
      }

      if(!isContinue) System.out.println(new StringBuilder(result).reverse().toString());
      else System.out.println("INVALID");
    }
		sc.close();
    }
}
