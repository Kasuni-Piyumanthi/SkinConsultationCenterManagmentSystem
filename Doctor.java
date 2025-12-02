import java.time.LocalDate;

public class Doctor extends Person{

    private int medicalLicenceNumber;
    private String specialisation;

    public Doctor (String name, String surname, LocalDate dateOfBirth, int mobileNumber) { super(name, surname, dateOfBirth, mobileNumber); }

    public int getMedicalLicenceNumber() {
        return medicalLicenceNumber;
    }

    public void setMedicalLicenceNumber(int medicalLicenceNumber) {
        this.medicalLicenceNumber = medicalLicenceNumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
