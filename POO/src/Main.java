import javax.print.Doc;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor = new Doctor();
        //Doctor myDoctor = new Doctor("Juancho");
        //myDoctor.showName();
        myDoctor.name = "Jesus Bermudez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorJesus = new Doctor();
        myDoctor.showId();*/

        //showMenu();

        Doctor myDoctor = new Doctor("Jesus B. Zamora","Surgeon");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
//        Patient patient = new Patient("Alejandra","alejandra@mail.com");
//        patient.setHeight(1.65);
//        patient.setWeight(54.8);
//        System.out.println(patient.getHeight() + " " +patient.getWeight());
    }
}



