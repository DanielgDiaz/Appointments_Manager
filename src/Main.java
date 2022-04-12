import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Dani", "dani@doctor.com" );
        myDoctor.addAvailableAppointment(new Date(), "16:00");
        myDoctor.addAvailableAppointment(new Date(), "10:00");
        myDoctor.addAvailableAppointment(new Date(), "13:00");

        System.out.println(myDoctor);

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        System.out.println();
        System.out.println();
        Patient patient = new Patient ("Dani", "dani@mail.com");


        System.out.println(patient);



    }


}
