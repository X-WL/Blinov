package by.xwl.Blinov.Chapter3;

import by.xwl.Card;
import by.xwl.FIO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * This class (@code Phone) implementation object Phone for Task Chapter 3 - A7.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */

public class Phone {
    /*This field (@code collObject) is current number of object class (@code Phone)*/
    static int collObject = 0;

    private int id;
    private FIO fio;
    private String adress;
    public Card card;
    private Date cityCallTime;
    private Date longCallTime;

    /**
     * This method (@code Phone) is base constructor of minimal params.
     *
     * @param fio    is (@code FIO)
     * @param adress is (@code String)
     * @param card   is (@code Card)
     * @author X-WL
     * @see #Phone(FIO, String, Card)
     * @see by.xwl
     */
    public Phone(FIO fio, String adress, Card card) {
        this.id = collObject++;
        this.fio = fio;
        this.adress = adress;
        this.card = card;
        this.cityCallTime = new Date(0);
        this.longCallTime = new Date(0);
    }

    /**
     * This method (@code Phone) is base constructor of full params.
     *
     * @param fio          is (@code FIO)
     * @param adress       is (@code String)
     * @param card         is (@code Card)
     * @param cityCallTime is (@code Date)
     * @param longCallTime is (@code Date)
     * @author X-WL
     * @see #Phone(FIO, String, Card, Date, Date)
     * @see by.xwl
     */
    public Phone(FIO fio, String adress, Card card, Date cityCallTime, Date longCallTime) {
        this.id = collObject++;
        this.fio = fio;
        this.adress = adress;
        this.card = card;
        this.cityCallTime = cityCallTime;
        this.longCallTime = longCallTime;
    }

    /**
     * This method (@code Phone) is base constructor of
     * full params and manual set (@code id).
     *
     * @param id           is (@code int)
     * @param fio          is (@code FIO)
     * @param adress       is (@code String)
     * @param card         is (@code Card)
     * @param cityCallTime is (@code Date)
     * @param longCallTime is (@code Date)
     * @author X-WL
     * @see #Phone(FIO, String, Card, Date, Date)
     * @see by.xwl
     */
    public Phone(int id, FIO fio, String adress, Card card, Date cityCallTime, Date longCallTime) {
        if (id > collObject) {
            collObject++;
        }
        this.id = id;
        this.fio = fio;
        this.adress = adress;
        this.card = card;
        this.cityCallTime = cityCallTime;
        this.longCallTime = longCallTime;
    }

    public static Comparator<Phone> NameComparator = new Comparator<Phone>() {
        @Override
        public int compare(Phone o1, Phone o2) {
            int out = o1.fio.getFirstName().compareTo(o2.fio.getFirstName());
            if (out == 0){
                out = o1.fio.getSecondName().compareTo(o2.fio.getSecondName());
                if (out == 0){
                    out = o1.fio.getPatronymic().compareTo(o2.fio.getPatronymic());
                }
            }
            return out;
        }
    };

    /**
     * This method printed full information this class.
     *
     * @author X-WL
     * @see #printInfo()
     * @see by.xwl.Blinov.Chapter2
     */
    public void printInfo() {
        this.fio.print();
        System.out.println("Adress: " + adress);
        this.card.print();
        System.out.println("Call time in City: " + cityCallTime.getTime());
        System.out.println("Call time out City: " + longCallTime.getTime());
        System.out.println();
    }

    /**
     * This method printed information of more limit abonent..
     *
     * @param input is array type (@code Phone)
     * @param limit is (@code Date)
     * @author X-WL
     * @see #printInfoForMorelimit(Phone[], Date)
     * @see by.xwl.Blinov.Chapter2
     */
    public static void printInfoForMorelimit(Phone[] input, Date limit) {
        System.out.println("Abonent list (credit exhaust):");
        for (int i = 0; i < input.length; i++) {
            if (input[i].cityCallTime.getTime() > limit.getTime()) {
                input[i].printInfo();
            }
        }
        System.out.println();
    }

    /**
     * This method printed information of abonent uses long call
     *
     * @param input is array type (@code Phone)
     * @author X-WL
     * @see #printInfoForLongCall(Phone[])
     * @see by.xwl.Blinov.Chapter2
     */
    public static void printInfoForLongCall(Phone[] input) {
        System.out.println("Abonent list (uses long call):");
        for (int i = 0; i < input.length; i++) {
            if (input[i].longCallTime.getTime() > new Date(0).getTime()) {
                input[i].printInfo();
            }
        }
        System.out.println();
    }

    /**
     * This method printed abonent information sorted of FIO
     *
     * @param input is array type (@code Phone)
     * @author X-WL
     * @see #printInfoSortedFIO(Phone[])
     * @see by.xwl.Blinov.Chapter2
     */
    public static void printInfoSortedFIO(Phone[] input) {
        System.out.println("Abonent list:");
        Arrays.sort(input,NameComparator);
        for (int i = 0; i < input.length; i++) {
            input[i].printInfo();
        }
        System.out.println();
    }
}
