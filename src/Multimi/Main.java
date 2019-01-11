package Multimi;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {


//        ArrayList myCollection = (new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5)));
//        Multime m3 = new Multime(myCollection);
//
////        m3.afisare();
//        m3.afisare();
//
//        System.out.println(m3.getDate());
//
//        m3.extrage(5);
//
//        m3.adauga(7);

//
//
//
//        System.out.println(m3.getDate());

        Multime m = new Multime(10);
        m.adauga(4);
        m.adauga(3);
        m.afisare();
        m.extrage(4);
        m.extrage(4);
        m.afisare();
        m.adauga(9);
        m.adauga(2);
        m.adauga(2);
        m.afisare();


    }
}
