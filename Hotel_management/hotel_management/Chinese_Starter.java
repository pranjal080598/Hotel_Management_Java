import java.io.*;
import java.lang.*;
public class Chinese_Starter
{
    static int total=0;static int b;static int q;static int price;
    public void main()throws IOException
    {
        bill mp=new bill();
        String []item1={"Veg.Chinese Bhel","Veg.Spring Roll","Veg.Lollypop","Veg.Crispy","Veg.Paneer Crispy","Veg.Paneer Spring Rolls","Veg.Paneer Garlic","Veg.Mushroom Roll","Paneer Chilly Fry","Paneer Ginger","Paneer Chong Fong","Paneer Schezwan","Veg.Chow Chow","Veg.Schezwan","Veg.Sweet & Sour"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("CHINESE STARTER ITEM                         PRICE");
            System.out.println("1:-Veg.Chinese Bhel............................33/-");
            System.out.println("2:-Veg.Spring Roll.............................40/-");
            System.out.println("3:-Veg.Lollypop................................40/-");
            System.out.println("4:-Veg.Crispy..................................40/-");
            System.out.println("5:-Veg.Paneer Crispy...........................45/-");
            System.out.println("6:-Veg.Paneer Spring Rolls.....................45/-");
            System.out.println("7:-Veg.Paneer Garlic...........................57/-");
            System.out.println("8:-Veg.Mushroom Roll...........................52/-");
            System.out.println("9:-Paneer Chilly Fry...........................57/-");
            System.out.println("10:-Paneer Ginger..............................57/-");
            System.out.println("11:-Paneer Chong Fong..........................62/-");
            System.out.println("12:-Paneer Schezwan............................57/-");
            System.out.println("13:-Veg.Chow Chow..............................52/-");
            System.out.println("14:-Veg.Schezwan...............................52/-");
            System.out.println("15:-Veg.Sweet & Sour...........................52/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr1={33,40,40,40,45,45,57,52,57,57,62,57,52,52,52};
            System.out.println("How many plates would you have?");
            q=Integer.parseInt(in.readLine());
            price=arr1[b-1]*q;
            total=arr1[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Chinese_Starter?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}   