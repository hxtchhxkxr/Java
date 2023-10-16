import java.util.Scanner;

class Student {
    int StudentNumber;
    String name;
    String major;
    int PhoneNumber;

    void setStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    int getStudentNumber() {
        return StudentNumber;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setMajor(String major) {
        this.major = major;
    }

    String getMajor() {
        return major;
    }

    void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    String getPhoneNumber() {
        String StrPhoneNumber = Integer.toString(PhoneNumber);
        StrPhoneNumber = "0" + StrPhoneNumber.substring(0, 2) + "-" + StrPhoneNumber.substring(2, 6)
                + "-" + StrPhoneNumber.substring(6);
        return StrPhoneNumber;
    }

}

public class Homework2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int StudentNumber = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            int PhoneNumber = scanner.nextInt();

            students[i].setStudentNumber(StudentNumber);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(PhoneNumber);

        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + students[0].getStudentNumber() + " " + students[0].getName()
                + " " + students[0].getMajor() + " " + students[0].getPhoneNumber());
        System.out.println("두번째 학생: " + students[1].getStudentNumber() + " " + students[1].getName()
                + " " + students[1].getMajor() + " " + students[1].getPhoneNumber());
        System.out.println("세번째 학생: " + students[2].getStudentNumber() + " " + students[2].getName()
                + " " + students[2].getMajor() + " " + students[2].getPhoneNumber());

        }
}