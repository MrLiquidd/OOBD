package Lab1;

public class Client extends Person {
    private Flower loveflower;
    public Client(String name, String surname, String email, String password, Flower loveflower) {
        super(name, surname, email, password);
        this.loveflower = loveflower;
    }

    public Flower getLoveflower() {
        return loveflower;
    }
    public void setLoveflower(Flower loveflower) {
        this.loveflower = loveflower;
    }
}

