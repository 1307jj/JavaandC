// Ch5 - 1.2 배열의 선언과 생성 + 기본값 확인
public class Ex15 {
    public static void main(String[] args) {

        // 선언 후 생성
        int[] score;
        score = new int[5];

        // 선언 + 생성 동시
        String[] name = new String[3];

        System.out.println("score.length = " + score.length);
        System.out.println("name.length  = " + name.length);

        // 기본값: int → 0, String → null
        System.out.println("score[0] 기본값 = " + score[0]);
        System.out.println("name[0]  기본값 = " + name[0]);
    }
}
