package Multimi;

import java.util.ArrayList;

public class Multime {

    private ArrayList<Integer> date;
    private final int dim;
    private int n;


    public Multime(int dim) {
        this.dim = dim;
        this.date = new ArrayList<Integer>();
        this.n = this.date.size();
    }


    public Multime() {
        this.dim = 10;
        this.date = new ArrayList<Integer>();
        this.n = this.date.size();
    }


    public Multime(ArrayList<Integer> date) {
        this.date = date;
        this.dim = this.date.size();
        this.n = this.dim;

    }

    public void adauga(int element) throws Exception {
        if (this.n == this.dim) {
            throw new Exception("Multimea este plina");
        }
        if (this.date.contains(element)) {
            //System.out.println("elementul exists deja in vector");
            return;
        }
        this.date.add(element);
        return;
    }

    public void extrage(int element){
        this.date.remove(Integer.valueOf(element));
        this.n = this.date.size();
    }

    public ArrayList<Integer> getDate() {
        return this.date;
    }

//    public ArrayList<Integer> afisare(){
//        return this.date;
//    }

    public void afisare(){
        System.out.println(this.date);
    }



}
