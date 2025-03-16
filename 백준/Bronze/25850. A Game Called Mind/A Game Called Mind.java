import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();

            for(int j = 0; j < m; j++) {
                // 값, 누가
                list.add(new ArrayList<>(Arrays.asList(sc.nextInt(), i)));
            }
        }

        // 0번째 값을 기준으로 정렬
        list.sort(Comparator.comparingInt(a -> a.get(0)));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++) {
            sb.append((char)('A' + list.get(i).get(1)));
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}