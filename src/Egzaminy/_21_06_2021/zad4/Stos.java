package Egzaminy._21_06_2021.zad4;

import java.util.ArrayList;

class Stos {
    ArrayList<Object> heap;
    public Stos(int size){
        this.heap = new ArrayList<>(size);
    }
    public void put(Object x){
        heap.add(x);
    }
}
