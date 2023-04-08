public class Jedi2 {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("A Jadi was dastroyed");
    }
}

class Sith {
    protected void finalize() throws Throwable {
        System.out.println("A Sith was destroyes");
    }
}
