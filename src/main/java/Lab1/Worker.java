package Lab1;

import Lab1.Person;

public class Worker extends Person {
    private boolean isDeliver;
    public Worker(String name, String surname, String email, String password, boolean isDeliver) {
        super(name, surname, email, password);
        this.isDeliver = isDeliver;
    }
}
