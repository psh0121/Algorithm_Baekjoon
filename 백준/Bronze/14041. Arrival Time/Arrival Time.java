import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(":");
        int startT = Integer.parseInt(time[0]+time[1]);

        // 통근시간은 2시간 = 120분
        // 120번의 반복문을 돌려가며 특정시간이 
        // 교통체증시간대에 걸리면 satrT에 +2
        // 교통체증시간대에 걸리지 않으면 startT에 +1
        for(int i = 1; i <= 120; i++) {
            if(
                (startT >= 700 && startT < 1000) ||
                (startT >= 1500 && startT < 1900)
            ) startT += 2;
            else startT++;

            // 만약 끝에 뒷자리가 60으로 끝나면 올려버린다
            if(startT % 100 == 60) startT += 40;
        }

        int[] endTime = {startT/100, startT%100}; // 시, 분
        if(endTime[0] >= 24) endTime[0] -= 24;

        System.out.printf("%02d:%02d\n", endTime[0], endTime[1]);
        sc.close();
    }
}