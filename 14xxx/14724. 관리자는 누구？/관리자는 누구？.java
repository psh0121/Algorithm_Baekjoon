import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String[] group = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT",
                      "MOTION", "SPG", "COMON", "ALMIGHTY"};
    int n = sc.nextInt();
    int maxNum = 0;
    int maxGroup = 0;

    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < n; j++) {
        int num = sc.nextInt();
        
        if(num > maxNum) {
          maxNum = num;
          maxGroup = i;
        }
      }
    }

    System.out.println(group[maxGroup]);
		sc.close();
    }
}
