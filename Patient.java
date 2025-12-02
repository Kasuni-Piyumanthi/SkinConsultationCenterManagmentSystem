import java.time.LocalDate;

public class Patient extends Person{

    private String uniqueID;

    public Patient(String name, String surname, LocalDate dateOfBirth, int mobileNumber) {
        super(name, surname, dateOfBirth, mobileNumber);
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
