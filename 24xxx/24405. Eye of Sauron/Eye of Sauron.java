import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int front = 0;
        int back = 0;

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(letter != '|') break;

            front++;
        }

        for(int i = str.length() - 1; i >= 0; i--) {
            char letter = str.charAt(i);

            if(letter != '|') break;

            back++;
        }

        System.out.println(front == back ? "correct" : "fix");
        sc.close();
    }
}