// Ch4 - 2.2 for문 (1부터 10까지의 합)
public class Ex08 {
    public static void main(String[] args) {

        // for (초기화; 조건식; 증감식)
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;   // sum = sum + i
        }

        System.out.println("1~10의 합 = " + sum);
    }
}
