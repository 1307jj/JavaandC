// Ch14 - 7.2 ObjectInputStream, ObjectOutputStream (직렬화)
import java.io.*;

class UserInfo implements java.io.Serializable {
    String name;
    transient String password;
    int age;

    UserInfo(String name, String password, int age) {
        this.name     = name;
        this.password = password;
        this.age      = age;
    }

    public String toString() {
        return "(" + name + ", " + password + ", " + age + ")";
    }
}

class Ex95 {
    public static void main(String[] args) {
        try {
            // 직렬화 (저장)
            FileOutputStream   fos = new FileOutputStream("objectfile.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
            UserInfo u2 = new UserInfo("JavaWoman", "5678", 25);

            out.writeObject(u1);
            out.writeObject(u2);
            out.close();
            System.out.println("직렬화 완료 - " + u1 + " / " + u2);

            // 역직렬화 (읽기)
            FileInputStream   fis = new FileInputStream("objectfile.ser");
            ObjectInputStream in  = new ObjectInputStream(fis);

            UserInfo r1 = (UserInfo) in.readObject();
            UserInfo r2 = (UserInfo) in.readObject();
            in.close();

            System.out.println("역직렬화 결과 - " + r1 + " / " + r2);
            System.out.println("password(transient)는 null: " + (r1.password == null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
