import java.io.*;

public class compassion {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        boolean positive = false;
        boolean even = false;
        if (a > 0)
            positive = true;
        if (a % 2 == 0)
            even = true;
        if (a == 0)
            System.out.println("balance");
        else if (positive && even)
            System.out.println("compassion");
        else if (positive && !even)
            System.out.println("mercy");
        else if (!positive && even)
            System.out.println("pain");
        else if (!positive && !even)
            System.out.println("anger");
    }
}
