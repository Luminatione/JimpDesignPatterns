package Egzaminy._21_06_2021.zad2;
class Gracz {
    String name;
    Stan stan;
    public Gracz(String name){
        this.name = name;
    }
    public void atakuj(){
        stan.ruch();
        stan.cios();
    }
    public void setStan(Stan stan){
        this.stan = stan;
    };
}
