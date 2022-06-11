package Egzaminy._21_06_2021.zad2;

public class Test {
    public static void main(String args[]){
        Gracz gracz = new Gracz("Gracz1");
        gracz.setStan( new Aktywny());
        gracz.atakuj();
        gracz.setStan( new Jedzący());
        gracz.atakuj();
    }
}