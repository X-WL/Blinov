package by.xwl;

/**
 * This class (@code FIO) implementation base function of name.
 *
 * @author X-WL
 * @see by.xwl
 */
public class FIO {
    private String firstName;
    private String secondName;
    private String patronymic;

    /**
     * This constructor use 3 (@code String) field.
     *
     * @param firstName  is (@code String)
     * @param secondName is (@code String)
     * @param patronymic is (@code String)
     * @author X-WL
     * @see #FIO(String, String, String)
     * @see by.xwl
     */
    public FIO(String firstName, String secondName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    /**
     * This method printed full information this class.
     *
     * @author X-WL
     * @see #print()
     * @see by.xwl
     */
    public void print(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Second name: " + getSecondName());
        System.out.println("Patronymic: " + getPatronymic());
    }
}
