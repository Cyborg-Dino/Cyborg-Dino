import java.util.*;

public class mainone {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(sumDigitsInNumber(number));
        }
    }

    public static int sumDigitsInNumber(int number) {
        return (number / 100 + number / 10 % 10 + number % 10);
    }
}
