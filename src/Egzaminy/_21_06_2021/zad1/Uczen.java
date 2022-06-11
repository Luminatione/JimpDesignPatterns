package Egzaminy._21_06_2021.zad1;
class Uczen extends Object implements Comparable <Uczen> {
    private String imie;
    private String nazwisko;
    private Double srednia;
    public Uczen(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Uczen(String imie, String nazwisko,double srednia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.srednia = srednia;
    }
    public String getImie(){
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    @Override
    public int hashCode() {//We have to return unique int value which is associated with
        return this.imie.hashCode() + this.nazwisko.hashCode() + this.nazwisko.hashCode();// MOŻE BYĆ ŹLE
    }

    @Override
    public boolean equals(Object o){
        if(o == this)//if we compare object to itself return true
            return true;
        if(!(o instanceof Uczen)) // if `THIS` object isn't Uczen object return false, if it's different class it can't
        {                           // be the same
            return false;
        }
        Uczen comparedObject = (Uczen) o;
        if (this.srednia == comparedObject.srednia && this.nazwisko.equals(comparedObject.nazwisko) && this.imie.equals( comparedObject.imie)){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Uczen o) {
        if (o.srednia > this.srednia){
            return 1;
        }
        else if (o.srednia < this.srednia)
        {
            return  -1;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Imie : " + this.getImie() + " Nazwisko : " + this.getNazwisko() + " Średnia : "+ this.getSrednia();
    }
}
