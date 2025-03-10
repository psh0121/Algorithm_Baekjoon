import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("#")) break;

            String[] arr = str.split(" ");
            StringBuilder resultSB = new StringBuilder();

            for(int i = 0; i < arr.length; i++) {
                String word = arr[i];
                StringBuilder sb = new StringBuilder();
                sb.append(word.charAt(0));

                if(word.length() == 1) {
                    resultSB.append(sb.toString() + " ");
                    continue;
                }

                StringBuilder reverseSB = new StringBuilder(word.substring(1, word.length() - 1));
                reverseSB.reverse();
                sb.append(reverseSB.toString());

                sb.append(word.charAt(word.length() - 1));
                sb.append(" ");

                resultSB.append(sb.toString());
            }

            System.out.println(resultSB.toString().trim());
        }
        sc.close();
    }
}