// Ch5 - 1.3 배열의 초기화 (두 가지 방법)
public class Ex16 {
    public static void main(String[] args) {

        // 방법 1: 선언과 동시에 중괄호로 초기화
        int[] score = {100, 90, 80, 70, 60};

        // 방법 2: new 키워드와 함께 초기화
        int[] score2 = new int[]{100, 90, 80, 70, 60};

        // 주의: 아래는 에러! (선언과 분리 시 new int[] 필요)
        // int[] score3;
        // score3 = {100, 90, 80, 70, 60};  // 컴파일 에러

        System.out.print("score  = ");
        for (int v : score)  System.out.print(v + " ");
        System.out.println();

        System.out.print("score2 = ");
        for (int v : score2) System.out.print(v + " ");
        System.out.println();
    }
}
