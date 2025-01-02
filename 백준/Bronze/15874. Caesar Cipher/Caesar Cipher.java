import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    ArrayList<Character> alphabetList = new ArrayList<>();
    for(int i = 0; i < alphabet.length(); i++) {
      alphabetList.add(alphabet.charAt(i));
    }

    int k = sc.nextInt();
    ArrayList<Character> encryptedList = new ArrayList<>();
    for(char c : alphabetList) encryptedList.add(c);

    for(int i = 1; i <= k; i++) {
      encryptedList.add(encryptedList.remove(0));
    }

    int s = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();

    StringBuilder result = new StringBuilder();

    for(int i = 0; i < s; i++) {
      char letter = str.charAt(i);

      if(letter == ' ' || letter == '.' || letter == ',') {
        result.append(letter);
        continue;
      }

      boolean isUpperCase = letter == Character.toUpperCase(letter) ? true : false;
      letter = Character.toLowerCase(letter);
      char encryptedLetter = encryptedList.get(alphabetList.indexOf(letter));

      if(isUpperCase) encryptedLetter = Character.toUpperCase(encryptedLetter);
      result.append(encryptedLetter);
    }

    System.out.println(result.toString());
		sc.close();
    }
}
