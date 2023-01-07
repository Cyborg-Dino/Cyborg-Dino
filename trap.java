import java.io.*;

public class trap {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        if (numb == 1)
            System.out.println("Duku is here");
        else if (numb == 2)
            System.out.println("It's a trap");
    }
}
