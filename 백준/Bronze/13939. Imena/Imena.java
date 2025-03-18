import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arr = str.split("[.!?]");

        for(int i = 0; i < arr.length; i++) {
            String[] sentence = arr[i].split(" ");
            int cnt = 0;

            for(int j = 0; j < sentence.length; j++) {
                String letter = sentence[j];

                if(letter.length() == 0) continue;

                if(letter.matches(".*\\d.*")) continue;

                if(
                    (letter.charAt(0) >= 65 && letter.charAt(0) <= 90) && 
                    (letter.substring(1, letter.length()).equals(letter.substring(1, letter.length()).toLowerCase()))
                ) {
                    cnt++;
                }
                
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}