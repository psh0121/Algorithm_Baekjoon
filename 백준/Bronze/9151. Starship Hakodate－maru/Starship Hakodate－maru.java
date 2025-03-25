import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();

        for(int i = 0; i*i*i <= 151200; i++) s1.add(i*i*i);
        for(int i = 0; i*(i+1)*(i+2)/6 <= 151200; i++) s2.add(i*(i+1)*(i+2)/6);
        
        while (true) {
            int num = sc.nextInt();
            if(num == 0) break;

            int result = 0;
            int diff = num;

            for(Integer val : s1) {
                if(val > num) continue;

                if(num - val < diff) {
                    result = val;
                    diff = num - val;
                }
            }

            for(Integer val : s2) {
                if(val > num) continue;

                if(num - val < diff) {
                    result = val;
                    diff = num - val;
                }
            }

            for(int i = 0; i < s1.size(); i++) {
                for(int j = 0; j < s2.size(); j++) {
                    int s3 = s1.get(i) + s2.get(j);

                    if(s3 > num) continue;

                    if(num - s3 < diff) {
                        result = s3;
                        diff = num - s3;
                    }
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}