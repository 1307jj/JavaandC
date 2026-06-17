// Ch14 - 4.2 FileReader와 FileWriter (텍스트 파일 읽기)
import java.io.*;

class Ex90 {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "test.txt";

        try {
            // 먼저 test.txt 생성
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello, 안녕하세요?");
            fw.close();

            // FileInputStream (바이트 단위)
            FileInputStream fis = new FileInputStream(fileName);
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            // FileReader (문자 단위)
            FileReader fr = new FileReader(fileName);
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
