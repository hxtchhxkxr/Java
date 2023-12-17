import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> IDAndPassword = new HashMap<String, String>();
        IDAndPassword.put("myId", "myPass");
        IDAndPassword.put("myId2", "myPass2");
        IDAndPassword.put("myId3", "myPass3");

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
