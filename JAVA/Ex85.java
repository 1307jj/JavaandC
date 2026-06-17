// Ch14 - 2.3 FileInputStream과 FileOutputStream (파일 복사)
import java.io.*;

class Ex85 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("USAGE : java Ex85 <source> <destination>");
            System.exit(0);
        }
        try {
            FileInputStream  fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();
            System.out.println("파일 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
