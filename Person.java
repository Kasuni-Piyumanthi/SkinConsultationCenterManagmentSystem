import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int mobileNumber;

    public Person(String name, String surname, LocalDate dateOfBirth, int mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
    }
}
