// AISL 장효창 
// 배열의 최댓값과 최솟값을 구하는 메서드를 작성하라.

package PPT_EX;

public class ex02_2_janghyochang {
    public static void main(String[] args){
        int[] arr = {10,11,2,5,3,3,24,15,6,9};
        int max =arr[0];
        int min =arr[0];

        for(int index : arr){
            if(index > max){
                max = index;
            }
            if(index < min ){
                min = index;
            }
        }

        System.out.println("최댓값은 " + max);
        System.out.println("최솟값은 " + min);
    }
    
}
