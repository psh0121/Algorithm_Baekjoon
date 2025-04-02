import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, Double> map = new HashMap<>();
        map.put('W', (double)1);
        map.put('H', (double)1/2);
        map.put('Q', (double)1/4);
        map.put('E', (double)1/8);
        map.put('S', (double)1/16);
        map.put('T', (double)1/32);
        map.put('X', (double)1/64);

        while (true) {
            String temp = sc.next();
            if(temp.equals("*")) break;

            int cnt = 0;

            String[] song = temp.split("/");    // 첫값과 끝값은 비워져있음

            for(int i = 1; i < song.length; i++) {
                double value = 0.0;
                String songPart = song[i];

                for(int j = 0; j < songPart.length(); j++) {
                    value += map.get(songPart.charAt(j));
                }

                if(value == 1.0) cnt++;
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}