import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int i = sc.nextInt();

        // 무효처리
        boolean jInvalid = (j != 0 && j != 2 && j != 5);
        boolean iInvalid = (i != 0 && i != 2 && i != 5);

        if(jInvalid && iInvalid) System.out.println("=");
        else if(jInvalid) System.out.println("<");
        else if(iInvalid) System.out.println(">");
        else if(j == i) System.out.println("=");
        else {
          if((j == 0 && i == 2) || (j == 2 && i == 5) || (j == 5 && i == 0)) {
            System.out.println(">");
          }
          else System.out.println("<");
        }

        sc.close();
    }
}