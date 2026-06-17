// Ch8 - 1.9 메서드에 예외 선언하기 예제4
import java.io.*;

class Ex71 {
    public static void main(String[] args) {
        try {
            String fileName = args.length > 0 ? args[0] : "test.txt";
            File f = createFile(fileName);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
