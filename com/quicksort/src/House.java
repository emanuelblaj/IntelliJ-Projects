public class House extends Building{

    public int numberOfRoms = 10;

    @Override
    public String toString() {
        return ("house");
    }

    public int getNumberOfRoms() {
        return numberOfRoms;
    }

    public void setNumberOfRoms(int numberOfRoms) {
        this.numberOfRoms = numberOfRoms;
    }
}
