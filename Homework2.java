import java.util.Scanner;

class Student {
    private int studentNumber;
    private String name;
    private String major;
    private long phoneNumber;

    // 생성자
    public Student(int studentNumber, String name, String major, long phoneNumber) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // Getter와 Setter 메소드
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학번 이름 전공 전화번호 입력 (순서대로, 띄어쓰기로 구분): ");
            int studentNumber = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            String phoneNumberString = scanner.next();

            // '-' 제거하고 앞자리 0 복구
            long phoneNumber = Long.parseLong(phoneNumberString.replaceAll("-", ""));

            students[i] = new Student(studentNumber, name, major, phoneNumber);
        }

        System.out.println("입력된 학생 정보:");
        for (Student student : students) {
            System.out.println("학번: " + student.getStudentNumber());
            System.out.println("이름: " + student.getName());
            System.out.println("전공: " + student.getMajor());
            String phoneNumber = String.format("010-%04d-%04d",
                    student.getPhoneNumber() / 10000, student.getPhoneNumber() % 10000);
            System.out.println("전화번호: " + phoneNumber);
            System.out.println();
        }

        scanner.close();
    }
}
