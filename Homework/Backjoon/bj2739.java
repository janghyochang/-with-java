import java.util.Scanner;

public class bj2739 {
    public static void main(String[] args){
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(input + " * " + i + " = " + input*i );
        }
    }
}
