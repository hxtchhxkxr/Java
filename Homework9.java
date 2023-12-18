import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    private static Map<String, String> IDAndPassword;
    public static void FileToHashMap() {
        try {
            FileReader fr = new FileReader("src\\db.txt");
            BufferedReader f = new BufferedReader(fr);
            String line = f.readLine();
            IDAndPassword = new HashMap<>();
            while (line != null) {
                line = line.trim();
                String[] KeyAndValue = line.split("\\s+");
                String key = KeyAndValue[0];
                String value = KeyAndValue[1];
                IDAndPassword.put(key, value);
                line = f.readLine();
            }
            f.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
    public static void main(String[] args) {
        FileToHashMap();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();
            if (IDAndPassword.containsKey(id)) {
                System.out.print("password : ");
                String password = scanner.nextLine().trim();
                if (IDAndPassword.containsValue(password)) {
                    System.out.println("id와 비밀번호가 일치합니다");
                    break;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        } while (true);
    }
}