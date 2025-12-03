import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    public ArrayList<Doctor> doctorList;
    public int doctor_limit;

    public void WestminsterLibraryManager(int maxNumberOfDoctors) {
        doctorList = new ArrayList< >();
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

        System.out.println("To Exit, press 0");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();


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

            case 0:
                this.exit();
                break;

            default:
                System.out.println("Invalid.Try again.");

        }

        return exit;
    }

    @Override
    public void addNewDoctor() {
        Scanner s = new Scanner (System.in);

        if(doctorList.size() >= doctor_limit){
            System.out.println("Doctor limit reached to " + doctor_limit + ". So, can't add more doctors.");
            return;
        }

        System.out.println("Enter Doctor's First Name: ");
        String name = s.nextLine();

        System.out.println("Enter Doctor's Last Name: ");
        String surname = s.nextLine();

        System.out.println("Enter Doctor's Date of Birth: ");
        LocalDate dateOfBirth = LocalDate.parse(s.next());

        System.out.println("Enter Doctor's Mobile Number: ");
        int mobileNumber = s.nextInt();

        System.out.println("Enter Doctor's Medical Licence Number");
        int medicalLicenceNumber = s.nextInt();

        System.out.println("Enter Doctor's Specialisation");
        String specialisation = s.nextLine();




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

    @Override
    public void exit() {

    }
}
