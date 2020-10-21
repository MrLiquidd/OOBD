package Lab1;

public class Flower {
    private String name;
    private double price;
    private String type;

    public Flower(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public Flower(){ setType("flower");}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flowers: \n" +
                "name:" + this.name + "\n" +
                "price:" + this.price + "\n" +
                "type:" + this.type+ "\n";
    }

    public int compareTo(Object obj) {
        Flower tmp = (Flower) obj;
        if(this.getPrice() < tmp.getPrice())
        {
            /* текущее меньше полученного */
            return -1;
        }
        else if(this.price > tmp.price)
        {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }

    /*public void setValue(String value) throws SQLException {
        String s = value.substring(1, value.length()-1);
        PGtokenizer t = new PGtokenizer(s, ',');
        this.name = t.getToken(0);
        this.price = t.getToken(1);
        this.type = Double.parseDouble(t.getToken(2));
    }*/

    public String getValue() {
        return "('" + name + "','" + price + "'," + type +")";
    }
}

