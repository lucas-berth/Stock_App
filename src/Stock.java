public class Stock extends FavInhabit{
    
    //private String ticker;
    //private int lastPrice;

    public Stock(String name, int price)
    {
        super(name, price);
    }

    void Display()
    {
        System.out.println(name + " / " + price);
    }
}
