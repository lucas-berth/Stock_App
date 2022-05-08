public class FavInhabit {
    
    protected String name;
    protected int price;

    FavInhabit(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
    void Display()
    {
        System.out.println(name + " / " + price);
    }

    
}

