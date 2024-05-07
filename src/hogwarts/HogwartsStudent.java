package hogwarts;

public abstract class HogwartsStudent {

    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public HogwartsStudent(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    private int sumOfBaseCharacteristics() {
        return powerOfMagic + transgressionDistance;
    }

    protected abstract int sumOfCharacteristics();

    protected void compareToStudent(HogwartsStudent hogwartsStudent) {
        printComparingResult(this, this.sumOfCharacteristics(), hogwartsStudent, hogwartsStudent.sumOfCharacteristics());
    }

    public void compareToHogwartsStudent(HogwartsStudent hogwartsStudent) {
        printComparingResult(this, this.sumOfBaseCharacteristics(), hogwartsStudent, hogwartsStudent.sumOfBaseCharacteristics());
    }

    private static void printComparingResult(HogwartsStudent hogwartsStudent1, int sumOfCharacteristics1, HogwartsStudent hogwartsStudent2, int sumOfCharacteristics2) {
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    hogwartsStudent1.getName(),
                    hogwartsStudent2.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s хуже студента %s (%d vs %d)%n",
                    hogwartsStudent1.getName(),
                    hogwartsStudent2.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else {
            System.out.printf(
                    "Студент %s и %s одинаковы (%d vs %d)%n",
                    hogwartsStudent1.getName(),
                    hogwartsStudent2.getName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        }
    }
    @Override
    public String toString() {
        return "%s, сила магии: %d, сила трансгресии: %d".formatted(name, powerOfMagic, transgressionDistance);
    }

    public void print() {
        System.out.println(this);
    }
}
