package Nou2;

public class Main {
    public static void main(String[] args) {

//        Animal bou = new Animal(6, 3, false);
//
//        System.out.println(Animal.jump());
//
//        System.out.println(bou.jump());
//
//        System.out.println(bou.getAge());
//
//        //   Dog azor = new Dog(50);
//        Dog azor = new Dog(50, "pink", "Mardare");
//        //azor.setColor("maro");
//
//        //Inheritance 3
//        Dog grivei = new Dog(2, "grey", "Mardare pasaroi");
//        Animal bird = new Animal(5, 2, true);
//
//        System.out.println(bird);
//
//        //asignare =>  bird = grivei
//        bird = grivei;
//
//        System.out.println(azor.getAge());
//        System.out.println(azor.getNrOfLegs());
//        System.out.println(azor.getColor());
//
//        System.out.println(bird);
//        System.out.println(bird.getAge() + " " + ((Dog) bird).getColor() + " " + bird.getNrOfLegs() + " " + bird.isVegetarian());
//
//        System.out.println(azor.bark());
//        System.out.println(((Dog) bird).bark());
//
//// sunt la fel pt ca cere un String - sout returneaza un string
//        System.out.println(azor);
//        System.out.println(azor.toString());
//
//
        Animal pantera = new Animal(9,4,false);
        Dog patrocle = new Dog(38, "verde", "Bubu");
//        Animal patruped = new Animal(7,4,true);
//
//        patruped = pantera;
//        patruped = patrocle;
//
//        System.out.println(pantera.toString());
//        System.out.println(patrocle.toString());



        Main.animalDetail(patrocle);
        Main.animalDetail(pantera);

    }

    public static void animalDetail(Animal animal){
        System.out.println(animal);
    }
}
