// Ch8 - 1.11 사용자정의 예외 만들기
class MyException extends Exception {
    private final int ERR_CODE;

    MyException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    MyException(String msg) {
        this(msg, 100);
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}

class Ex73 {
    public static void main(String[] args) {
        try {
            throw new MyException("사용자 정의 예외 발생", 200);
        } catch (MyException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            System.out.println("에러 코드 : " + e.getErrCode());
        }
    }
}
