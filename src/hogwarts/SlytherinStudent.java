package hogwarts;

public class SlytherinStudent extends HogwartsStudent{

    private int trickness;
    private int resoluteness;
    private int ambitiousness;
    private int resourcefulness;
    private int thristOfPower;

    public SlytherinStudent(String name, int powerOfMagic, int transgressionDistance, int trickness, int resoluteness, int ambitiousness, int resourcefulness, int thristOfPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.trickness = trickness;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.thristOfPower = thristOfPower;
    }

    public int getTrickness() {
        return trickness;
    }

    public void setTrickness(int trickness) {
        this.trickness = trickness;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThristOfPower() {
        return thristOfPower;
    }

    public void setThristOfPower(int thristOfPower) {
        this.thristOfPower = thristOfPower;
    }

    @Override
    protected int sumOfCharacteristics() {
        return trickness+resoluteness+ambitiousness+resourcefulness+thristOfPower;
    }

    public void compareTo(SlytherinStudent slytherinStudent) {
        compareTo(slytherinStudent);
    }

    @Override
    public String toString() {
        return super.toString()+ ", хитрость: %d, решительность: %d, амбициозность: %d, находчивость: %d, жажда власти: %d".formatted(trickness, resoluteness, ambitiousness, resourcefulness, thristOfPower);
    }
}
