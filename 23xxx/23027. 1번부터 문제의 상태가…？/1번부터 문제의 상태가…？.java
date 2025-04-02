import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String result = "";

    if(s.contains("A")) {
      result = s.replaceAll("[BCDF]", "A");
    }
    else if(s.contains("B")) {
      result = s.replaceAll("[CDF]", "B");
    }
    else if(s.contains("C")) {
      result = s.replaceAll("[DF]", "C");
    }
    else result = s.replaceAll(".", "A");


    System.out.println(result);
		sc.close();
    }
}
