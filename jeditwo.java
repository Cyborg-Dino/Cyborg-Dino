import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class jeditwo {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String phrase = bufferedReader.readLine(); // Fire on fuel tanks!
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
        System.out.println(phrase);
    }
}
