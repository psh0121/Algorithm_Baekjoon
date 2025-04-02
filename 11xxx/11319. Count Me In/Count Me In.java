import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String vowels = "aeiou";
    int n = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < n; i++) {
      String str = sc.nextLine().toLowerCase();
      int a = 0;
      int b = 0;

      for(int j = 0; j < str.length(); j++) {
        String letter = Character.toString(str.charAt(j));
        if(letter.equals(" ")) continue;

        if(vowels.contains(letter))b++;
        else a++;
      }

      System.out.println(a + " " + b);
    }
		sc.close();
    }
}
