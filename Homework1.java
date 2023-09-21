//Homework1.java
import java.util.Scanner;
//public class Homework1 {
//}

public class Homework1 {
    public static void main(String[]args) {
        int sum = 0;
        for (int cnt = 0; cnt < 5; cnt++ )
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("정수를 입력하세요:");
            int num = sc.nextInt();
            sum += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d 입니다.\n",sum);


        }
    }
}