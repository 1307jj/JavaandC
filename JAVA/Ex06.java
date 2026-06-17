// Ch4 - 1.4 switch문 (사칙연산)
public class Ex06 {
    public static void main(String[] args) {

        char op = '*';
        int num1 = 6, num2 = 3, result = 0;

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
