public class Crypto extends FavInhabit{
    
    //private String Cname;
    //private int lastPrice;

    public Crypto(String name, int price)
    {
        super(name, price);
    }

    void Display()
    {
        System.out.println(name + " / " + price);
    }
}
