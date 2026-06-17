// Ch14 - 5.1 BufferedReader와 BufferedWriter (readLine)
import java.io.*;

class Ex91 {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "Ex91.java";

        try {
            FileReader     fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                if (line.indexOf(";") != -1) {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
