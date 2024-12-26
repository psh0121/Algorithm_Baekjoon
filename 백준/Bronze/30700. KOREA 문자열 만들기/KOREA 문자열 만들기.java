import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] korea = {'K', 'O', 'R', 'E', 'A'};
    int koreaIdx = 0;
    String result = "";

    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == korea[koreaIdx]) {
        result += s.charAt(i);
        koreaIdx++;

        if(koreaIdx == 5) koreaIdx = 0;
      }
    }
    
    System.out.println(result.length());
		sc.close();
    }
}
