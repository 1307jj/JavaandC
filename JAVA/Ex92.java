// Ch14 - 5.2 InputStreamReader와 OutputStreamWriter (콘솔 라인 입력)
import java.io.*;

class Ex92 {
    public static void main(String[] args) {
        String line = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader    br  = new BufferedReader(isr);

            System.out.println("입력하세요. (종료하려면 q를 입력)");
            while (!(line = br.readLine()).equalsIgnoreCase("q")) {
                System.out.println("입력 : " + line);
                System.out.println("다시 입력하세요. (q:종료)");
            }
            System.out.println("프로그램 종료");
        } catch (IOException e) {
        }
    }
}
