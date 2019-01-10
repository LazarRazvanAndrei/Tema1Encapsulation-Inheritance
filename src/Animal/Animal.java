package Animal;

public class Animal {

    private int age;
    private int numberOfLegs;
    private boolean vegetarian;

    public Animal() {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() { this.age = age;}


    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(){this.numberOfLegs = numberOfLegs;}


    public boolean getVegetarian() {
        return this.vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void eat() {
        System.out.print("Animal is eating");
    }

    @Override
    public String toString() {
        return String.format(
                "Age: %d, NumberOfLegs: %d, Vegetarian: %b",
                this.age,
                this.numberOfLegs,
                this.vegetarian
        );
    }
}
