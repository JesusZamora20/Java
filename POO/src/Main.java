import javax.print.Doc;

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
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}



