import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    public ArrayList<Doctor> doctorList;
    public int doctor_limit;

    public void WestminsterLibraryManager(int maxNumberOfDoctors) {
        doctorList = new ArrayList<Doctor>();
        doctor_limit = maxNumberOfDoctors;

    }

    @Override
    public boolean runMenu() {
        boolean exit = false;

        // Run console menu
        System.out.println("\n-- WESTMINSTER LIBRARY MANAGER CONSOLE MENU--");

        System.out.println("To Add a new doctor, press 1");

        System.out.println("To Delete a doctor, press 2");

        System.out.println("To Display the list of the doctors, press 3");

        System.out.println("To Save the data, press 4");

        Scanner s = new Scanner(System.in);
        int choice;
        choice = s.nextInt();


        switch (choice) {

            case 1:
                this.addNewDoctor();
                break;

            case 2:
                this.deleteDoctor();
                break;

            case 3:
                this.printListOfDoctors();
                break;

            case 4:
                this.saveData();
                break;

        }

        return exit;
    }

    @Override
    public void addNewDoctor() {
        Scanner s = new Scanner (System.in);

        if(doctorList.size() < doctor_limit){


            }


    }

    @Override
    public void deleteDoctor() {

    }

    @Override
    public void printListOfDoctors() {

    }

    @Override
    public void saveData() {

    }
}
