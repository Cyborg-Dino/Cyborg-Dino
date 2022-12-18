import java.io.*;

public class solutiontwenty {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine(); // Darth Sidious
        System.out.println(name + " - is a header of the Senate");
    }
}
