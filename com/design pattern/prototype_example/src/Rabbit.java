public class Rabbit implements Cloneable {
    public enum Breed {
        HIMALYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

//    age in months
    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit() {

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        Person owner =new Person(name);
        this.owner = owner;
    }

    public Rabbit(int age, Breed breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public Rabbit clone() {
        try{
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }

}
