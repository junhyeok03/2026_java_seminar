package ch0324;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 실습 문제 - 나이 입력 프로그램
 * <p>
 * 아래 코드를 실행하면 예외가 발생합니다.
 * try-catch-finally를 추가해서 프로그램이 정상 동작하도록 고쳐보세요.
 * <p>
 * 힌트:
 * - "abc" 처럼 숫자가 아닌 값을 입력하면 → ??? Exception
 * - -1 처럼 음수를 입력하면          →  ??? Exception
 * - finally 블록에서 scanner를 닫아주세요
 */

public class Exam1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException();
            }
            else if (age >= 18) {
                System.out.println("성인입니다. (" + age + "세)");
            } else {
                System.out.println("미성년자입니다. (" + age + "세)");
            }
        } catch (InputMismatchException e) {
            System.out.println("[오류] 숫자를 입력해 주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("[오류] 나이는 0 이상이어야 합니다.");
        } finally {
            scanner.close();
        }
    }
}