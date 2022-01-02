import java.util.Scanner;

public class bj10950 {
    public static void main(String[] args){
        int cycle, A, B;
        Scanner scanner = new Scanner(System.in);
        cycle = scanner.nextInt();
        int[] arr = new int[cycle]; 

        for(int i=0;i<cycle;i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            arr[i] = A+B;
        }

        for(int num : arr){
            System.out.println(num);
        }
        // for(int num=0; num<arr.length;num++){
        //     System.out.println(arr[num]);
        // }
    }
}
