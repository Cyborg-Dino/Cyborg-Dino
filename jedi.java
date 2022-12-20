import java.io.*;

public class jedi {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine(); // Master Windu
        String count = bufferedReader.readLine(); // 212
        System.out.println(name + " is here with " + count + " jedis");
    }
}
