package Egzaminy._21_06_2021.zad3;

public class Test
{
    // main method
    public static void main(String[] args)
    {
        try
        {
            /* try - spróbuj wykonać kod, a kod to samo wyrzucenie błędu
                if (1 == 1){
                   Print("matematyka dyskretna ma sens"):
                   }
                else{
                    Tois jest łatwy
                }
            * */
            throw new NiepoprawneZycie("Bo chciałeś/łaś zdać tois");
        }
        catch (NiepoprawneZycie ex)
        {
            System.out.println("Znaleziono wyjątek z treścią :");
            System.out.println(ex.getMessage());
        }

    }
}