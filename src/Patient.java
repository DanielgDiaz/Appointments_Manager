public class Patient extends User{
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;


    Patient (String name, String email) {
        super(name, email);
        //mas instrucciones
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " M.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbirthday: " + birthday +
                ", weight: " + getWeight() +
                ", height: " + getHeight() +
                ", blood: " + blood;
    }
}
