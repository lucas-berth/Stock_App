import java.util.*;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        

        ArrayList<Stock> favoritesList = new ArrayList<Stock>();

        Stock Apple = new Stock("APPL", 162);
        Stock Tesla = new Stock("TSLA", 863);
        Stock Nvidia = new Stock("NVDA", 186);
        Stock Intel = new Stock("INTC", 44);
        Stock ASML = new Stock("ASML", 551);
        Stock Google = new Stock("GOOGL", 2300);
        Stock Meta = new Stock("FB", 203);
        

        favoritesList.add(Apple);
        favoritesList.add(Tesla);
        favoritesList.add(Nvidia);
        favoritesList.add(Intel);
        favoritesList.add(ASML);
        favoritesList.add(Google);
        favoritesList.add(Meta);



        ArrayList<FavInhabit> collectionOfFavs = new ArrayList<FavInhabit>();

        Crypto BTC = new Crypto("Bitcoin", 33910);
        Crypto ETH = new Crypto("Ethereum", 2513);
        Crypto SOL = new Crypto("Solana", 75);


        //loading the new ArrayList with every new instance 
        collectionOfFavs.add(BTC);
        collectionOfFavs.add(ETH);
        collectionOfFavs.add(SOL);
        collectionOfFavs.add(Apple);
        collectionOfFavs.add(Tesla);
        collectionOfFavs.add(Nvidia);
        collectionOfFavs.add(Intel);
        collectionOfFavs.add(ASML);
        collectionOfFavs.add(Google);
        collectionOfFavs.add(Meta);


        



        //to advance implement an API from yahoo finance
        //Apple.Display();



        //To Lower Case / Upper Case
        String a1 = "Elephant";
        System.out.println(a1.toLowerCase());
        System.out.println(a1.toUpperCase());


        //Print in reverse
        String a2 = "monkey";
        for(int i = a2.length() - 1; i >= 0; i--)
        {
            System.out.println(a2.charAt(i));
        }

        System.out.println("-----------String Functions-------------");

        //count space
        String a3 = "Lucas IS Here";
        App.countSpace(a3);
        System.out.println("remove spaces");
        App.removeSpace(a3);

        String b1 = "Lucas";
        String b2 = new String("Lucas");
        String b3 = "Lucas";
        if(b1 == b3)
        {
            System.out.println("matching addresses");
        }
        if(b1.equals(b2))
        {
            System.out.println("Matching Contents");
        }
        else{
            System.out.println("False");
        }







        System.out.println("----------------Array Stuff-------------------");
        App.countArray(collectionOfFavs);

        int[] anArray;
        anArray = new int[1000]; 

        for(int i = 0; i < anArray.length; i++)
        {
            if(i % 2 != 0)
            {
                anArray[i] += i;
            }
        }

        for(int i = 0; i < anArray.length; i++)
        {
            System.out.println(anArray[i]);
        }
        
        
        
    }

    public static void countSpace(String a)
    {
        int count = 0;
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void removeSpace(String a)
    {
        String temp = "";
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != ' ')
            {
                temp = temp + a.charAt(i);
            }
        }
        System.out.println(temp);
    }

    public static void countArray(ArrayList<FavInhabit> List)
    {
        int countS = 0;
        int countC = 0;
        for(int i = 0; i < List.size(); i++)
        {
            if(List.get(i) instanceof Crypto)
            {
                countC++;
            }
            else if(List.get(i) instanceof Stock)
            {
                countS++;
            }
        }
        System.out.println(countC);
        System.out.print(countS);

    }

    public static void displayArray(ArrayList<FavInhabit> theList)
    {
        for(int i = 0; i < theList.size(); i++)
        {
            if(theList.get(i) instanceof Crypto)
            {
                System.out.println("not sure how to display arraylist items");
            }
        }
    }
}
