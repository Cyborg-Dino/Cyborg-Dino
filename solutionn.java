import java.io.*;

public class solutionn {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (((name1.equals("Anakin")) | (name1.equals("Obi-Wan")))
                & ((name2.equals("Obi-Wan")) | (name2.equals("Anakin"))))
            System.out.println(name1 + " and " + name2 + " - friends");
        else if (((name1.equals("Anakin")) || (name1.equals("Obi-Wan")))
                && ((!name2.equals("Obi-Wan")) && (!name2.equals("Anakin"))))
            System.out.println(name1 + " - friend, " + name2 + " - foe");
        else if (((!name1.equals("Anakin")) && (!name1.equals("Obi-Wan")))
                && ((name2.equals("Obi-Wan")) || (name2.equals("Anakin"))))
            System.out.println(name2 + " - friend, " + name1 + " - foe");
        else
            System.out.println(name1 + " and " + name2 + " - foes");
    }
}
