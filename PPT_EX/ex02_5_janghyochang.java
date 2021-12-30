// AISL 장효창 
// 사용자로부터 소문자 알파벳 1개를 입력받아 대문자로 변경하여 출력하는 코드를 작성하라.

package PPT_EX;

import java.util.Scanner;

public class ex02_5_janghyochang {
    public static void main(String[] args){
            String[][] alphabets = {
                    {"A", "a"}, {"B", "b"}, {"C", "c"},
                    {"D", "d"}, {"E", "e"}, {"F", "f"},
                    {"G", "g"}, {"H", "h"}, {"I", "i"},
                    {"J", "j"}, {"K", "k"}, {"L", "l"},
                    {"M", "m"}, {"N", "n"}, {"O", "o"},
                    {"P", "p"}, {"Q", "q"}, {"R", "r"},
                    {"S", "s"}, {"T", "t"}, {"U", "u"},
                    {"V", "v"}, {"W", "w"}, {"X", "x"},
                    {"Y", "y"}, {"Z", "z"}
            };
    
            System.out.print("소문자를 입력해주세요:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
    
            if (str.length() > 1) {
                scanner.close();
                return;
            }
    
            for (int i = 0; i < alphabets.length; i++) {
                if (alphabets[i][0].equals(str)) {
                    System.out.println("결과: " + alphabets[i][1]);
                } else if (alphabets[i][1].equals(str)) {
                    System.out.println("결과: " + alphabets[i][0]);
                }
            }
        }

    }
