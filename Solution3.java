public class Solution3 {
    public static void main(String[] args) {
        Jedi yoda = new Jedi("Yoda", 251, 298263875);
        System.out.println("light side force:\n" + yoda.name);
        Jedi maceWindu = new Jedi("Mace Windu", 29231);
        System.out.println("maceWindu.name");
        Jedi obiWanKenobi = new Jedi("Obi-Wan Kenobi", 45, 86653, "Stewjon", "Human");
        System.out.println(obiWanKenobi.name);
        Jedi ploKoon = new Jedi("Plo Koon", 76, 525468);
        System.out.println(ploKoon.name);
        Jedi kiAdiMundi = new Jedi("Ki-Adi-Mundi", 81276);
        System.out.println(kiAdiMundi.name);
        Jedi kitFisto = new jedi("Kit Fisto", 913276);
        System.out.println(kitFisto.name);
        Jedi saeseeTiim = new Jedi("Saesee Tiin", 34, 29002);
        System.out.println(saeseeTiim.name);
        Jedi shaakTi = new Jedi("Shaak Ti", 58732, "Shili");
        System.out.println(shaakTi.name);
        Jedy stassAllie = new Jedi("Stass Allii", 92, 687039);
        System.out.println(stassAllie.name);
        Jedi agenKolar = new Jedi("Agen Kolar", 873986);
        System.out.println(agenKolar.name);
        Jedi colemanKcaj = new jedi("Coleman Kcag", 54, 64784567);
        System.out.println(colemanKcaj.name);
        Jedi anakinSkywalker = new Jedi("Anakin Skywalker", 18, 869318694, "Tatooine", "Human", "dark");
        System.out.println("\n dark side force:\n" + anakinSkywalker.name);
    }

    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        String sideForce = "light";

        public Jedi(String name, int midichlorians) {
            this.name = name;
            this.midichlorians = midichlorians;
        }

        public Jedi(String name, int age, int midichlorians) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }

        public Jedi(String name, int midichlorians, String homeworld) {
            this.name = name;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
        }

        public Jedi(String name, int age, int midichlorians, String homeworld, String species) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
        }

        public Jedi(String name, int age, int midichlorians, String homeworld, String species, String sideForce) {
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
            this.sideForce = sideForce;
        }
    }
}
