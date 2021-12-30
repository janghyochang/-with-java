// AISL 장효창 
// 순서가 없는 두 배열에서 서로 같은 요소를 포함하는지 판별하는 메서드를 작성하라

package PPT_EX;

public class ex02_3_janghyochang {
    public static void main(String[] args){
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {2, 3, 1};

        boolean isDuplicate = false;
        for (int i = 0 ; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.println("두 배열은 다른 배열입니다.");
                break;
            } else if (i + 1 == arr1.length) {
                System.out.println("두 배열은 같은 배열입니다.");
            }
        }

    }
    
}
