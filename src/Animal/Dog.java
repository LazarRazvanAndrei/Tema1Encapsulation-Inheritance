package Animal;

public class Dog extends Animal {

    private String color = "green";

    public Dog(int age, String color) {
        super( );
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String bark() {
        return "bark";
    }

    @Override
    public String toString() {
        return String.format("%s, color: %s", super.toString(), this.color);
    }


}
