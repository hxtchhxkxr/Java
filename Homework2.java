import java.util.Scanner;

class Student {
    private int studentNumber;
    private String name;
    private String major;
    private String phoneNumber;

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        // 전화번호를 010-xxxx-xxxx 형태로 변환
        if (phoneNumber.length() == 11) {
            return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 7) + "-" + phoneNumber.substring(7);
        } else {
            return phoneNumber;
        }
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3명의 학생 정보를 입력받아 Student 객체를 생성
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentNumber = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            String phoneNumber = scanner.next();

            // 학생 객체에 정보 설정
            students[i].setStudentNumber(studentNumber);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phoneNumber);
        }

        // 입력된 학생 정보 출력
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            System.out.println("첫번째 학생: " + students[i].getStudentNumber() + " " + students[i].getName()
                    + " " + students[i].getMajor() + " " + students[i].getFormattedPhoneNumber());
        }

        scanner.close();
    }
}
