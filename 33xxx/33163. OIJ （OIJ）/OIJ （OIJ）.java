import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String result = "";

        for(int i = 0; i < n; i++) {
            char letter = s.charAt(i);

            if(letter == 'J') result += 'O';
            else if(letter == 'O') result += 'I';
            else result += 'J';
        }

        System.out.println(result);
        sc.close();
    }
}