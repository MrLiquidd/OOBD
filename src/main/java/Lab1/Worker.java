package Lab1;

public class Worker extends Person {

    private String Deliver;
    public Worker(String name, String surname, String email, String password, boolean isDeliver) {
        super(name, surname, email, password);
        this.Deliver = Deliver;
    }
    public String getDeliver() {
        return Deliver;
    }

    public void setPosition(String position) {
        this.Deliver = Deliver;
    }
}
