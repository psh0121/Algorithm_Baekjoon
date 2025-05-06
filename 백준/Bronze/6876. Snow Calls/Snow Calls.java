import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next().replaceAll("-", "");
            String[] ph = s.split("");

            String[] number = {
                "0", "1", "2ABC", "3DEF",
                "4GHI", "5JKL", "6MNO",
                "7PQRS", "8TUV", "9WXYZ"
            };

            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < number.length; j++) {
                    if(number[j].contains(ph[i])) {
                        ph[i] = Integer.toString(j);
                    }
                }
            }

            System.out.println(ph[0] + ph[1] + ph[2] + "-" + 
                            ph[3] + ph[4] + ph[5] + "-" + 
                            ph[6] + ph[7] + ph[8] + ph[9]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
