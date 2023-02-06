public class solution1 {
    public static void main(String[] args) {
        Jedy jedy = new Jedy();
        jedy.initialize("Obi-Wan Kenobi", 29, 50);
    }

    static class Jedy {
        String name;
        int age;
        int midichlorians;

        public void initialize(String name, int age, int midichlorians) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }
    }
}
