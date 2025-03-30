import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        int t = sc.nextInt();
        int cnt = 0;

        String[] word = new String[t];
        for(int i = 0; i < t; i++) word[i] = sc.next();

        String number = sc.next();

        for(int i = 0; i < t; i++) {
            String temp = word[i];
            StringBuilder value = new StringBuilder();

            for(int j = 0; j < temp.length(); j++) {
                String letter = Character.toString(temp.charAt(j));

                for(int k = 1; k <= 9; k++) {
                    if(phone[k].contains(letter)) {
                        value.append(k);
                        break;
                    }
                }
            }

            if(number.equals(value.toString())) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}