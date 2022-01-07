import java.util.Scanner;

public class bj10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne, inputTwo,temp;
        

        inputOne = scanner.nextInt();
        inputTwo = scanner.nextInt();

        for(int i=0;i<inputOne;i++){
            temp = scanner.nextInt();
            if (temp < inputTwo){
                System.out.print(temp + " ");
            }
        }

    }
}
