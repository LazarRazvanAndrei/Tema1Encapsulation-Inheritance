package Nou2;

public class Animal {

    private int age;
    private int nrOfLegs;
    private boolean vegetarian;

    public Animal(int age, int nrOfLegs, boolean vegetarian) {

        this.age = age;
        this.nrOfLegs = nrOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
//cu instanta ( fa boul)
    public String eat(){
        return "Animal is eating";
    }
//fara instanta
    public static String jump(){
        return "Animal is jumping";
    }

    @Override
    public String toString() {
// e acelasi lucru        return "Age: " + this.getAge() + ", number of legs: " + this.getNrOfLegs() ...
        return String.format(
                "Age: %d, number of legs: %d, vegetarian: %b",
                this.getAge(),
                this.getNrOfLegs(),
                this.isVegetarian()
        );
    }
}
