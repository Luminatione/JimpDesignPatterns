package Egzaminy._21_06_2021.zad2;

class Aktywny implements Stan{
    @Override
    public void ruch() {
        System.out.println("Biegam bo już jestem aktywny!");
    }

    @Override
    public void skok() {
        System.out.println("Skacze bo już jestem aktywny!");
    }

    @Override
    public void cios() {
        System.out.println("Uderzam bo już jestem aktywny!");
    }
}
