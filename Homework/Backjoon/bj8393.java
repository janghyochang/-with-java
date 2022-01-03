import java.util.Scanner;

public class bj8393 {
    public static void main(String[] args){
        int input;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        for(int i=0; i<input+1; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
