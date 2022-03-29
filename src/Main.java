import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Dani", "Surgeon" );
        myDoctor.addAvailableAppointment(new Date(), "16:00");
        myDoctor.addAvailableAppointment(new Date(), "10:00");
        myDoctor.addAvailableAppointment(new Date(), "13:00");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


       /* Patient patient = new Patient("Rigoberto", "rigo@email.com");
        patient.setWeight(80.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("664109778");
        System.out.println(patient.getPhoneNumber());*/


    }


}
