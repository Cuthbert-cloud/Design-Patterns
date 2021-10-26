public class Rabbit implements Cloneable {

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit() {}

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
//            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
