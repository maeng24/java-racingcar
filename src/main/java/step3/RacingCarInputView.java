package step3;

import java.util.Scanner;

public class RacingCarInputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    static int scanNumberOfCar() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    static int scanNumberOfRace() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }
}