import java.util.*;

public class jedione {
    public static void main(String[] args) throws Exception {
        int jedis = 212;
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(jedis - number);
        }
    }
}
