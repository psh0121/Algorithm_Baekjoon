import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int[] arr = new int[strArr.length + 1];
        for(int i = 1; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i-1]);

        // 숫자가 적혀있는 위치
        int leftIdx = Integer.MIN_VALUE;
        int rightIdx = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                if(leftIdx == Integer.MIN_VALUE) {
                    leftIdx = i;
                }
                else if(rightIdx == Integer.MIN_VALUE) {
                    rightIdx = i;
                    break;
                }
            }
        }

        // 조건 성립파악
        int a = 0;
        int d = (arr[rightIdx] - arr[leftIdx])/(rightIdx - leftIdx);

        if((double)(arr[rightIdx] - arr[leftIdx])/(double)(rightIdx - leftIdx) != d) {
            System.out.println(-1);
            return;
        }

        a = arr[leftIdx] - (leftIdx * d);

        // 값 채워넣기
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) continue;
            arr[i] = a + (i * d);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb.toString().trim());
        
        sc.close();
    }
}