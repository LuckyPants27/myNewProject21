package hogwarts;

public class RavenclawStudent extends HogwartsStudent{

    private int intellect;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int powerOfMagic, int transgressionDistance, int intellect, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    protected int sumOfCharacteristics() {
        return intellect+wisdom+wit+creativity;
    }

    public void compareTo(RavenclawStudent ravenclawStudent) {
        compareTo(ravenclawStudent);
    }

    @Override
    public String toString() {
        return super.toString()+ ", ум: %d, мудрость: %d, остроумие: %d, творчество: %d".formatted(intellect, wisdom, wit, creativity);
    }
}
