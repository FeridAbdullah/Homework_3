public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1975);
        Human father = new Human("Vito", "Karleone", 1973);
        Human child = new Human("Michael", "Karleone", 2000, 90, new String[][]{{"Monday", "Reading"}});

        Family family = new Family(mother, father);
        family.addChild(child);

        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        family.setPet(pet);

        System.out.println(family);
        child.greetPet();
        child.describePet();
    }
}
