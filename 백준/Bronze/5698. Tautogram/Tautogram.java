import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    while (true) {
      String str = sc.nextLine();
      if(str.equals("*")) break;

      String[] arr = str.split(" ");
      String value = "";

      for(int i = 0; i < arr.length; i++) {
        value += Character.toString(arr[i].charAt(0)).toLowerCase();
      }

      value = value.replaceAll(Character.toString(value.charAt(0)), "");

      System.out.println(value.length() == 0 ? "Y" : "N");
    }
		sc.close();
    }
}
