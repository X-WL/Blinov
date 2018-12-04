package by.xwl.Blinov.Chapter3;

import by.xwl.Card;
import by.xwl.FIO;
import by.xwl.IO;
import by.xwl.Information;

import java.util.Date;

/**
 * This class (@code Task_3_A7 implementation Task Chapter 3 - A7.
 * @author X-WL
 * @see by.xwl.Blinov.Chapter3
 */
public class Task_3_A7 {
    public static void main(String[] args) {
        Phone[] array = new Phone[3];
        array[0] = new Phone(new FIO("Abrams","Tomas","Adamovich"),
                "street",
                new Card(new int[] {1111,2222,3333,4444},12234,123254),
                new Date(270), new Date(4910));
        array[1] = new Phone(new FIO("Oswald","Fred","Ferani"),
                "street",
                new Card(new int[] {1110,2220,3330,4440},125234,1234),
                new Date(1250), new Date(0));
        array[2] = new Phone(new FIO("Wayne","Thomas","Pervy"),
                "street",
                new Card(new int[] {1100,2200,3300,4400},12234,1234),
                new Date(2509), new Date(310));
        Phone.printInfoForMorelimit(array,new Date(1200));
        Phone.printInfoForLongCall(array);
        Phone.printInfoSortedFIO(array);
        Information info = new Information("30.11.2018, 11:06");
        info.printInformation();
        IO.waitingPress();
    }
}
