import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String leftLetters = "qwertyasdfgzxcvb";
        String rightLetters = "uiophjklnm";
        int left = 0;
        int right = 0;
        int sapce = 0;
        int shift = 0;

        for(int i = 0; i < str.length(); i++) {
          String letter = "" + str.charAt(i);

          if(leftLetters.contains(letter) || leftLetters.toUpperCase().contains(letter)) left++;
          else if(rightLetters.contains(letter) || rightLetters.toUpperCase().contains(letter)) right++;
          else if(letter.equals(" ")) sapce++;
          
          if((!letter.equals(" ")) && (letter.equals(letter.toUpperCase()))) shift++;
        }

        for(int i = 1; i <= sapce+shift; i++) {
          if(left == right) left++;
          else if(left > right) right++;
          else if(left < right) left++;
        }

        System.out.println(left + " " + right);
        sc.close();
    }
}