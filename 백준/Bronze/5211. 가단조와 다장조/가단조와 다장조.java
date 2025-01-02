import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String midA = "ADE";
    String midC = "CFG";
    String[] arr = sc.next().split("\\|");
    int a = 0;
    int c = 0;
    char lastValue = '.';

    for(int i = 0; i < arr.length; i++) {
      String value = Character.toString(arr[i].charAt(0));
      if(midA.contains(value)) a++;
      else if(midC.contains(value)) c++;

      if(i == arr.length - 1) {
        lastValue = arr[i].charAt(arr[i].length() - 1);
      }
    }

    if(a > c) System.out.println("A-minor");
    else if(a == c) {
      if(midA.contains(Character.toString(lastValue)))System.out.println("A-minor");
      else System.out.println("C-major");
    }
    else System.out.println("C-major");
		sc.close();
    }
}
