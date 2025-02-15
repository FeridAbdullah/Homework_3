import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    static {
        System.out.println("Loading Human class...");
    }

    {
        System.out.println("Creating a new Human object...");
    }

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getIq() { return iq; }
    public void setIq(int iq) { this.iq = iq; }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    public String[][] getSchedule() { return schedule; }
    public void setSchedule(String[][] schedule) { this.schedule = schedule; }

    public void greetPet() {
        if (family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null) {
            String slyness = family.getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + family.getPet().getSpecies() + ", it is " +
                    family.getPet().getAge() + " years old, it is " + slyness);
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", schedule=" + Arrays.deepToString(schedule) + "}";
    }
}
