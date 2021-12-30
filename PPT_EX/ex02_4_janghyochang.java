// AISL 장효창 
// 중복된 요소를 제거한 새 배열을 반환하는 메서드를 작성하라.

package PPT_EX;

public class ex02_4_janghyochang {
    public static void main(String[] args){
        int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
        int[] result = new int[10];
        int index = 0;
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] != -1 && arr[j] != -1) && arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
    
            if (arr[i] != -1) {
                result[index++] = arr[i];
            }
        }
    
        System.out.print("중복 제거 한 배열: ");
        for (int data : result) {
            System.out.print(data + " ");
        }
    }
}
