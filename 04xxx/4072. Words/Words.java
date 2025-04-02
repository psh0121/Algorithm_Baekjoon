import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
          String str = sc.nextLine();
          if(str.equals("#")) break;

          String[] arr = str.split(" ");

          for(int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
          }

          System.out.println(String.join(" ", arr));
        }
        sc.close();
    }
}
