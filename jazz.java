import java.io.*;

public class jazz {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int count = Integer.parseInt(reader.readLine());
        while (count != 0) {
            System.out.println(str); //Jazz and blues is my life
            count--;
        }
    }
}
