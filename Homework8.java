import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> loginInfo = new HashMap<>();
        loginInfo.put("myId", "myPass");
        loginInfo.put("myId2", "myPass2");
        loginInfo.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = scanner.nextLine().trim();

            if (!loginInfo.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password: ");
            String password = scanner.nextLine().trim();

            if (loginInfo.get(id).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
