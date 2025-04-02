import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
        String largeAlpha = smallAlpha.toUpperCase();
        String number = "0123456789";

        String[] temp = sc.nextLine().split(" ");
        int j = Integer.parseInt(temp[0]);
        int n = Integer.parseInt(temp[1]);
        int cnt = 0;

        for(int i = 0; i < n; i++) {
          int len = 0;
          String str = sc.nextLine();

          for(int k = 0; k < str.length(); k++) {
            String letter = "" + str.charAt(k);

            if(smallAlpha.contains(letter)) len += 2;
            else if(largeAlpha.contains(letter)) len += 4;
            else if(number.contains(letter)) len += 2;
            else len++;
          }

          if(len <= j) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}