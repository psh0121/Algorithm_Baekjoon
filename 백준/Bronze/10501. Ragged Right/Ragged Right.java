import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int maxLen = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            list.add(str);
            maxLen = Math.max(maxLen, str.length());
        }

        int result = 0;

        for(int i = 0; i < list.size()-1; i++) {
            int cal = (maxLen - list.get(i).length()) * (maxLen - list.get(i).length());
            result += cal;
        }

        System.out.println(result);
        sc.close();
    }
}