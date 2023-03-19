import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Jesus B. Zamora", "jesus@correo.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("yisus", "yisus@correo.com");
        user.showDataUser();

        User user1 = new User("Jesuchrist", "Jesuchrist@correo.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void shedule(Date date, String time) {
                
            }
        };

        /*
        for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*Patient patient = new Patient("Juancho","juanchorois@gmail.com");
        System.out.println(patient);*/
    }
}



