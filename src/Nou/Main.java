package Nou;

public class Main {
    public static void main(String[] args) {
        User ion = new User("asd", "qwe", "erte");
        User nihai = new User("aaa", "bbb", "ccc");


        System.out.println(ion.generateDisplayName());

        System.out.println(ion.getUsername());

        ion = nihai;

        System.out.println(ion.getUsername());

        System.out.println(nihai.getUsername());

    }
}

