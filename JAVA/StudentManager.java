package testProject;
import java.util.Scanner;

// 학생 기본 클래스
class Student {
    protected String hakbun;
    protected String irum;
    protected int[] jeomsu;
    protected String[] gwamok;

    public Student(String hakbun, String irum, String[] gwamok, int[] jeomsu) {
        this.hakbun = hakbun;
        this.irum = irum;
        this.gwamok = gwamok;
        this.jeomsu = jeomsu;
    }

    public int getTotalJeomsu() {
        int sum = 0;
        for (int j : jeomsu) sum += j;
        return sum;
    }

    public double getAvg() {
        return (double) getTotalJeomsu() / jeomsu.length;
    }

    public String getHakjeom() {
        double avg = getAvg();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    public void showInfo() {
        System.out.println("--------------------------------------------------");
        System.out.printf("학번: %s | 이름: %s | 구분: %s%n", hakbun, irum, getGubun());
        System.out.printf("%-10s", "과목");
        for (String g : gwamok) System.out.printf("%-8s", g);
        System.out.println();
        System.out.printf("%-10s", "점수");
        for (int j : jeomsu) System.out.printf("%-8d", j);
        System.out.println();
        System.out.printf("총점: %d | 평균: %.1f | 학점: %s%n", getTotalJeomsu(), getAvg(), getHakjeom());
    }

    public String getGubun() {
        return "학부생";
    }
}

// 대학원생 클래스 (학생 상속)
class DaeHakwonSaeng extends Student {
    private String yeonguBunya;

    public DaeHakwonSaeng(String hakbun, String irum, String[] gwamok, int[] jeomsu, String yeonguBunya) {
        super(hakbun, irum, gwamok, jeomsu);
        this.yeonguBunya = yeonguBunya;
    }

    @Override
    public String getGubun() {
        return "대학원생";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("연구분야: " + yeonguBunya);
    }
}

// 점수 오류 예외
class JeomsuOryuException extends Exception {
    public JeomsuOryuException(String msg) {
        super(msg);
    }
}

// 중복 학번 예외
class JungbokHakbunException extends Exception {
    public JungbokHakbunException(String msg) {
        super(msg);
    }
}

public class StudentManager {

    static Student[] list = new Student[100];
    static int cnt = 0;
    static Scanner sc = new Scanner(System.in);
    static String[] GWAMOK = {"국어", "영어", "수학"};

    public static void main(String[] args) {
        sampleData();
        while (true) {
            showMenu();
            System.out.print("선택 >> ");
            String sel = sc.nextLine().trim();
            switch (sel) {
                case "1": addStudent();   break;
                case "2": showAll();      break;
                case "3": searchStudent(); break;
                case "4": deleteStudent(); break;
                case "5": showStats();    break;
                case "6": showRank();     break;
                case "0":
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    static void showMenu() {
        System.out.println("\n==========================================");
        System.out.println("         학생 성적 관리 시스템");
        System.out.println("==========================================");
        System.out.println(" 1. 학생 추가");
        System.out.println(" 2. 전체 조회");
        System.out.println(" 3. 학생 검색");
        System.out.println(" 4. 학생 삭제");
        System.out.println(" 5. 통계");
        System.out.println(" 6. 석차");
        System.out.println(" 0. 종료");
        System.out.println("==========================================");
    }

    static void addStudent() {
        try {
            System.out.println("\n[ 학생 추가 ]");
            System.out.print("구분 (1:학부생 / 2:대학원생): ");
            String gubun = sc.nextLine().trim();

            System.out.print("학번: ");
            String hb = sc.nextLine().trim();
            if (findByHakbun(hb) != null)
                throw new JungbokHakbunException("이미 있는 학번입니다: " + hb);

            System.out.print("이름: ");
            String nm = sc.nextLine().trim();

            int[] js = new int[GWAMOK.length];
            for (int i = 0; i < GWAMOK.length; i++) {
                System.out.print(GWAMOK[i] + " 점수: ");
                js[i] = Integer.parseInt(sc.nextLine().trim());
                if (js[i] < 0 || js[i] > 100)
                    throw new JeomsuOryuException("0~100 사이 점수만 입력 가능합니다: " + js[i]);
            }

            if (gubun.equals("2")) {
                System.out.print("연구분야: ");
                String bunya = sc.nextLine().trim();
                list[cnt++] = new DaeHakwonSaeng(hb, nm, GWAMOK, js, bunya);
            } else {
                list[cnt++] = new Student(hb, nm, GWAMOK, js);
            }
            System.out.println("추가 완료!");

        } catch (JeomsuOryuException | JungbokHakbunException e) {
            System.out.println("[오류] " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[오류] 숫자를 입력하세요.");
        }
    }

    static void showAll() {
        System.out.println("\n[ 전체 목록 ] " + cnt + "명");
        if (cnt == 0) { System.out.println("학생이 없습니다."); return; }
        for (int i = 0; i < cnt; i++) list[i].showInfo();
    }

    static void searchStudent() {
        System.out.println("\n[ 검색 ]");
        System.out.print("학번 또는 이름: ");
        String kw = sc.nextLine().trim();
        boolean found = false;
        for (int i = 0; i < cnt; i++) {
            if (list[i].hakbun.equals(kw) || list[i].irum.contains(kw)) {
                list[i].showInfo();
                found = true;
            }
        }
        if (!found) System.out.println("없습니다.");
    }

    static void deleteStudent() {
        System.out.println("\n[ 삭제 ]");
        System.out.print("삭제할 학번: ");
        String hb = sc.nextLine().trim();
        for (int i = 0; i < cnt; i++) {
            if (list[i].hakbun.equals(hb)) {
                for (int j = i; j < cnt - 1; j++) list[j] = list[j + 1];
                list[--cnt] = null;
                System.out.println("삭제 완료");
                return;
            }
        }
        System.out.println("해당 학번이 없습니다.");
    }

    static void showStats() {
        if (cnt == 0) { System.out.println("학생이 없습니다."); return; }
        System.out.println("\n[ 통계 ]");
        double sum = 0;
        double maxA = list[0].getAvg(), minA = list[0].getAvg();
        String maxNm = list[0].irum, minNm = list[0].irum;
        int[] hjCnt = new int[5]; // A B C D F

        for (int i = 0; i < cnt; i++) {
            double avg = list[i].getAvg();
            sum += avg;
            if (avg > maxA) { maxA = avg; maxNm = list[i].irum; }
            if (avg < minA) { minA = avg; minNm = list[i].irum; }
            switch (list[i].getHakjeom()) {
                case "A": hjCnt[0]++; break;
                case "B": hjCnt[1]++; break;
                case "C": hjCnt[2]++; break;
                case "D": hjCnt[3]++; break;
                case "F": hjCnt[4]++; break;
            }
        }
        System.out.printf("학생 수: %d명%n", cnt);
        System.out.printf("전체 평균: %.1f%n", sum / cnt);
        System.out.printf("최고: %.1f (%s)%n", maxA, maxNm);
        System.out.printf("최저: %.1f (%s)%n", minA, minNm);
        System.out.println("--------------------------------------------------");
        String[] hj = {"A", "B", "C", "D", "F"};
        for (int i = 0; i < hj.length; i++)
            System.out.printf("  %s: %d명%n", hj[i], hjCnt[i]);
    }

    static void showRank() {
        if (cnt == 0) { System.out.println("학생이 없습니다."); return; }
        System.out.println("\n[ 석차 ]");
        Student[] tmp = new Student[cnt];
        for (int i = 0; i < cnt; i++) tmp[i] = list[i];
        for (int i = 0; i < cnt - 1; i++)
            for (int j = 0; j < cnt - 1 - i; j++)
                if (tmp[j].getTotalJeomsu() < tmp[j + 1].getTotalJeomsu()) {
                    Student t = tmp[j]; tmp[j] = tmp[j + 1]; tmp[j + 1] = t;
                }
        System.out.printf("%-5s %-10s %-6s %-8s %-5s%n", "순위", "이름", "총점", "평균", "학점");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < cnt; i++)
            System.out.printf("%-5d %-10s %-6d %-8.1f %-5s%n",
                    i + 1, tmp[i].irum, tmp[i].getTotalJeomsu(), tmp[i].getAvg(), tmp[i].getHakjeom());
    }

    static Student findByHakbun(String hb) {
        for (int i = 0; i < cnt; i++)
            if (list[i].hakbun.equals(hb)) return list[i];
        return null;
    }

    static void sampleData() {
        list[cnt++] = new Student("20210001", "김준우", GWAMOK, new int[]{88, 92, 95});
        list[cnt++] = new Student("20210002", "이지은", GWAMOK, new int[]{75, 80, 70});
        list[cnt++] = new Student("20210003", "박민준", GWAMOK, new int[]{60, 55, 65});
        list[cnt++] = new DaeHakwonSaeng("20240001", "최수연", GWAMOK, new int[]{95, 98, 92}, "인공지능");
    }
}