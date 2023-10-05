import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 몇 개의 정수를 입력받을 것인지 먼저 입력
        System.out.print("정수의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        // 정수들을 저장할 배열 생성
        int[] numbers = new int[count];

        // 배열의 0번째 요소를 초기화
        System.out.print("정수를 입력하세요: ");
        numbers[0] = scanner.nextInt();
        int min = numbers[0];
        int max = numbers[0];

        // 나머지 정수들을 입력받아 배열에 저장하고 최소값과 최대값 갱신
        for (int i = 1; i < count; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 최소값과 최대값 출력
        System.out.println("입력된 정수 중 최소값: " + min);
        System.out.println("입력된 정수 중 최대값: " + max);

        scanner.close();
    }
}







}
