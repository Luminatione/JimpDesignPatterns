package Egzaminy._21_06_2021.zad2;

class Jedzący implements Stan {
    @Override
    public void ruch() {
        System.out.println("Jem więc więc ruszam się mając jedzenie w dłoniach");
    }

    @Override
    public void skok() {
        System.out.println("Jem więc skaczę mając jedzenie w dłoniach");
    }

    @Override
    public void cios() {
        System.out.println("Jem więc jedzenie wypada mi z dłoni gdy uderzam");
    }
}
