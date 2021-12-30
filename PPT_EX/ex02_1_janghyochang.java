// AISL 장효창 
// 5개의 양수를 입력받은 배열의 모든 요소의 합을 구하는 메서드를 작성하라.

package PPT_EX;

import java.util.Scanner;

public class ex02_1_janghyochang{
    public static void main(String[] args){
        int[] arr = new int[5];
        int sum =0;
        
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<5; i++){
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }

        scanner.close();
        System.out.println(sum);
    }
}