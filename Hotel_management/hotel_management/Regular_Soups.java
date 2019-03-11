import java.io.*;
import java.lang.*;
public class Regular_Soups
{
    static int total=0;static int b;static int q;static int price;
    public void main1()throws IOException
    { 
        bill mp=new bill();
        String []item1={"Tomato soup","Tomato soup with cream","Vegetable Soup","Veg.Soup with Cream","Veg.Ministrone Soup","Veg.Palak Soup","Palak Cheese Soup","Jaljeera","Jaljeera with Soda","Coriander Soup"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("SOUPS                                          PRICE");
            System.out.println("1:-Tomato Soup......................................60/-");
            System.out.println("2:-Tomato Soup with Cream...........................75/-");
            System.out.println("3:-Vegetable Soup...................................60/-");
            System.out.println("4:-Veg.Soup with Cream..............................75/-");
            System.out.println("5:-Veg.Ministrone Soup..............................80/-");
            System.out.println("6:-Veg.Palak Soup...................................80/-");
            System.out.println("7:-Palak Cheese Soup...............................100/-");
            System.out.println("8:-Jaljeera.........................................40/-");
            System.out.println("9:-Jaljeera with Soda...............................55/-");
            System.out.println("10:-Coriander Soup..................................60/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr1={60,75,60,75,80,80,100,40,55,60};
            System.out.println("How many plates do you want?");
            int q=Integer.parseInt(in.readLine());
            price=arr1[b-1]*q;
            total=arr1[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from regular_soups?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}