import java.io.*;

public class smiley {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int v = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int g = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        for (int a = m; a != 0; a--) {
            for (int b = n; b != 0; b--) {
                for (int c = v; c != 0; c--) {
                    for (int d = x; d != 0; d--) {
                        for (int f = g; f != 0; f--)
                            for (int i = k; i != 0; i--) {
                                System.out.print('('); // 1
                            }
                        System.out.print('*'); // 1
                    }
                    System.out.print('_'); // 1
                }
                System.out.print('*'); // 1
            }
            System.out.print(')'); // 1
        }
        System.out.println(); //1 //should work (*_*)
    }
}
