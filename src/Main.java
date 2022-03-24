import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Batman";
        myDoctor.showName();
        myDoctor.showId();

        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();

        showMenu();
    }


}
