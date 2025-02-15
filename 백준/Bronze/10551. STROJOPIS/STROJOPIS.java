import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {
            "1QAZ", "2WSX", "3EDC", "45RTFGVB",
            "67YUHJNM", "8IK,", "9OL.", "0P-=[];'/"
        };
        int[] cntArr = new int[8];

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ' ') continue;

            for(int j = 0; j < 8; j++) {
                if(arr[j].contains(Character.toString(letter))) {
                    cntArr[j]++;
                    break;
                }
            }
        }

        for(int i = 0; i < 8; i++) System.out.println(cntArr[i]);
        sc.close();
    }
}