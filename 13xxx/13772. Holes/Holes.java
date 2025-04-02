import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int one = 0;
            int two = 0;

            for(int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);

                if(
                    letter == 'A' || 
                    letter == 'D' ||
                    letter == 'O' ||
                    letter == 'P' ||
                    letter == 'Q' ||
                    letter == 'R'
                ) one++;
                else if(letter == 'B') two++;
            }

            System.out.println(one + (two * 2));
        }
        sc.close();
    }
}
