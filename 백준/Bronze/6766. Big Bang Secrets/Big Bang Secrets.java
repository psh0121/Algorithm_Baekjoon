import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            int idx = alphabet.indexOf(str.charAt(i));
            int newIndex = (i+1) * 3 + k;
            newIndex = idx - newIndex;
            if(newIndex < 0) newIndex += 26;
            newIndex %= 26;

            sb.append(alphabet.charAt(newIndex));
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}