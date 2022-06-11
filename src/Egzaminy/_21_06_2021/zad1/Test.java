package Egzaminy._21_06_2021.zad1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String args[]){
        ArrayList studentList = new ArrayList();

        studentList.add(new Uczen("Sandy", "aaa", 28));
        studentList.add(new Uczen("Roxy", "aaaaaa", 28.02));
        studentList.add(new Uczen("Sunil", "sss", 27));
        studentList.add(new Uczen("Munish", "ddd", 27));

        Collections.sort(studentList);

        Iterator iterator=studentList.iterator();
        while(iterator.hasNext()){
            Uczen uczen=(Uczen) iterator.next();
            System.out.println(uczen.toString());
        }
    }
}