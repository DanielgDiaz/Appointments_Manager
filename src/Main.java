import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Dani", "Surgeon" );
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Rigoberto", "rigo@email.com");
        patient.setWeight(80.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("664109778");
        System.out.println(patient.getPhoneNumber());


    }


}
