// Ch8 - 1.8 finally블럭
class Ex67 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() {
        // 프로그램 설치에 필요한 준비를 하는 코드
    }

    static void copyFiles() {
        // 파일들을 복사하는 코드
    }

    static void deleteTempFiles() {
        System.out.println("임시파일 삭제 완료");
    }
}
