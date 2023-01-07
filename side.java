import java.io.*;

public class side {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0)
            System.out.println("it's Light side");
        else if (a < 0)
            System.out.println("it's Dark side");
        else if (a == 0)
            System.out.println("it's a balance");
    }
}
