// Ch5 - 1.7 배열의 복사 (System.arraycopy() 이용)
public class Ex23 {
    public static void main(String[] args) {

        char[] arr1 = {'0', '1', '2', '3', '4'};
        char[] arr2 = {'A', 'B', 'C', 'D', 'E'};

        // System.arraycopy(src, srcPos, dest, destPos, length)
        // arr1[1]부터 2개를 → arr2[2]부터 붙여넣기
        System.arraycopy(arr1, 1, arr2, 2, 2);

        System.out.print("arr1: ");
        for (char c : arr1) System.out.print(c + " ");
        System.out.println();

        // arr2: A B 1 2 E  (C,D 자리에 1,2 가 복사됨)
        System.out.print("arr2: ");
        for (char c : arr2) System.out.print(c + " ");
        System.out.println();
    }
}
