// Ch5 - 1.7 배열의 복사 (for문 이용)
public class Ex22 {
    public static void main(String[] args) {

        int[] number    = {1, 2, 3, 4, 5};
        int[] newNumber = new int[10];   // 더 큰 배열

        // for문으로 요소 하나씩 복사
        for (int i = 0; i < number.length; i++) {
            newNumber[i] = number[i];
        }

        System.out.print("number    : ");
        for (int v : number)    System.out.print(v + " ");
        System.out.println();

        System.out.print("newNumber : ");
        for (int v : newNumber) System.out.print(v + " ");
        System.out.println();
    }
}
