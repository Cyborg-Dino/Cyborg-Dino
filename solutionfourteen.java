/*public class solutionfourteen {
    public static void main(String[] args) {
    }

    static class Owner {
        String name;

        void say() {
            System.out.println("Hello, my name is " + name + " and my " + kind + " is " + color);
        }
    }

    static class Pet {
        String kind;
        String color;
    }
}*/
//farther
/*public class solutionfourteen {
    public static void main(String[] args) {
        Owner owner_1 = new Owner();
        Pet pet_1 = new Pet();
        owner_1.name = "Cyborg";
        pet_1.kind = "cat";
        pet_1.color = "red";
    }
    static class Owner {
        String name;

        void say() {
            System.out.println("Hello, my name is " + name + " and my " + kind + " is " + color);
        }
    }
    static class Pet {
        String kind;
        String color;
    } 
}*/
//farther
public class solutionfourteen {
    public static void main(String[] args) {
        Owner owner_1 = new Owner();
        Pet pet_1 = new Pet();
        owner_1.name = "Cyborg";
        pet_1.kind = "cat";
        pet_1.color = "red";
        owner_1.pet = pet_1;
        owner_1.say();
    }

    static class Owner {
        String name;
        Pet pet;

        void say() {
            System.out.println("Hello, my name is " + name + " and my " + pet.kind + " is " + pet.color);
        }
    }

    static class Pet {
        String kind;
        String color;
    }
}
