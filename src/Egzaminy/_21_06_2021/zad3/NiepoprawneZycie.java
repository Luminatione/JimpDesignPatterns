package Egzaminy._21_06_2021.zad3;

class NiepoprawneZycie extends Exception {
    public NiepoprawneZycie(String czemuNiepoprawne){
        super(czemuNiepoprawne);//super - używa konstruktora super klasy naszej obecnej klasy
        // klasa NiepoprawneZycie dziedziczy po klasie Exception więc klasa Exception jest jej super klasą

    }
}
