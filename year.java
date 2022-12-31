import java.util.*;

public class year {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (getYear(number) < 0) {
                System.out.println(Math.abs(getYear(number)) + " year before Yawin");
            } else {
                System.out.println(getYear(number) + " year after Yawin");
            }
        }
    }

    public static int getYear(int number) {
        return number - 35;
    }
}
