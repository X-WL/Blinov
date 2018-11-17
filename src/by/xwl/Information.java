package by.xwl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Class (@code Information)
 *
 * @author X-WL
 * @see by.xwl
 */

public class Information {
    protected String authorName;
    String timeCreate;
    String timeRun;

    /**
     * This constructor create object of default value.
     *
     * @author X-WL
     * @see #Information()
     * @see by.xwl.Information
     */
    public Information() {
        this.authorName = "X-WL";
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        this.timeCreate = String.format(dateFormat.format(new Date()));
        this.timeRun = String.format(dateFormat.format(new Date()));
    }

    /**
     * This constructor create object of default
     * value and set date create project.
     *
     * @param timeCreate is set time create project.
     * @author X-WL
     * @see #Information(String)
     * @see by.xwl.Information
     */
    public Information(String timeCreate) {
        this.authorName = "X-WL";
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        this.timeCreate = timeCreate;
        this.timeRun = String.format(dateFormat.format(new Date()));
    }

    /**
     * This constructor create object of set author
     * name, set date create project and
     * default date run project.
     *
     * @param author     is set author name project
     * @param timeCreate is set time create project
     * @author X-WL
     * @see #Information(String, String)
     * @see by.xwl.Information
     */
    public Information(String author, String timeCreate) {
        this.authorName = author;
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        this.timeCreate = timeCreate;
        this.timeRun = String.format(dateFormat.format(new Date()));
    }

    /**
     * This method print information of author name, time create and run program.
     * @author X-WL
     * @see #printInformation()
     * @see by.xwl.Information
     */
    public void printInformation() {
        System.out.println();
        System.out.println("Name: " + authorName);
        System.out.println("Time Create Project: " + timeCreate);
        System.out.println("Time Run Project: " + timeRun);
    }
}
