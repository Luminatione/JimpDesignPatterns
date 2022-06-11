package Egzaminy._21_06_2021.zad4;

class Test {
    public static void main(String args[])
    {
        Stos stos = new Stos(50);
        UzupelnijStos S1 = new UzupelnijStos( stos, 1 );
        UzupelnijStos S2 = new UzupelnijStos( stos , 2 );

        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
