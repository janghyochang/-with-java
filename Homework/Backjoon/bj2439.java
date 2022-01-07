import java.util.Scanner;

public class bj2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        input = scanner.nextInt();
        // String[] arr = new String[input];

        for(int i=1;i<=input;i++){
            for(int j=1;j<=input-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }


            System.out.println("");
        }


    }
}
