package Nou2;

public class Dog extends Animal {

    public String name;
    private String color;

    public Dog(int age, String color, String name) {

        super(age, 4, false);
        this.color = color;
        this.name = name;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // pt ca nu returneaza nica punem void
    public String bark() {
        return this.name + " is barking";

    }

    @Override
    public String toString() {

        return String.format(
                "%s, numele %s, culoare %s",
                super.toString(),
                this.name,
                this.getColor()
        );

    }
}
