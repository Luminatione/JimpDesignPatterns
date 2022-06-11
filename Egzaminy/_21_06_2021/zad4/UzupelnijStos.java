package Egzaminy._21_06_2021.zad4;

import java.util.Random;

class UzupelnijStos extends Thread{
    double odstep;
    Stos stos;
    UzupelnijStos(Stos stos, double odstep){
        this.stos = stos;
        this.odstep = odstep;
    }

    @Override
    public void run() {
        Random rd = new Random();
        synchronized (stos){
            try {
                for (int i = 0; i < 2; i++) {

                    sleep(1000 * (long)odstep);
                    System.out.println("odstep czasowy to:"+1000 * (long)odstep );
                    stos.put(rd.nextDouble());
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
