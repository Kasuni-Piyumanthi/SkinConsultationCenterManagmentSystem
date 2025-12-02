import java.time.LocalDateTime;

public class Consultation {

    private int cost;
    private String notes;
    private LocalDateTime dateAndTimeSlot;
    private Doctor doctor;
    private Patient patient;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getDateAndTimeSlot() {
        return dateAndTimeSlot;
    }

    public void setDateAndTimeSlot(LocalDateTime dateAndTimeSlot) {
        this.dateAndTimeSlot = dateAndTimeSlot;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
