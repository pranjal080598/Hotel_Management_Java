import java.io.*;
import java.lang.*;
public class Chinese_cuisine_dishes
{
    static int total=0;static int b;static int q;static int price;
    public void main5()throws IOException
    {
        bill mp=new bill();String []item1={"Hakka Chowmien","Veg.Chowmien","Veg.Chow Chow","Veg.Szechwan","American Choupsey","Veg.Noodles","Veg.Hakka Noodles","Veg.Spring Roll with Mushroom","Veg.Spring Roll with Bamboo","Veg.Spring Roll with Bamboo Shoot&Mushroom","Veg.Spring Roll","Veg.Sizzler","Veg.Grill Sizzler","Cheese Sizzler","Paneer Sizzler"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("CHINESE DISHES                             PRICE");
            System.out.println("1:-Hakka Chowmien......................................52/-");
            System.out.println("2:-Veg.Chowmien........................................52/-");
            System.out.println("3:-Veg.Chow Chow.......................................52/-");
            System.out.println("4:-Veg.Szechwan........................................52/-");
            System.out.println("5:-American Choupsey...................................52/-");
            System.out.println("6:-Veg.Noodles.........................................52/-");
            System.out.println("7:-Veg.Hakka Noodles...................................55/-");
            System.out.println("8:-Veg.Spring Roll with Mushroom.......................52/-");
            System.out.println("9:-Veg.Spring Roll with Bamboo Shoot...................52/-");
            System.out.println("10:-Veg.Spring Roll with Bamboo Shoot & Mushroom.......52/-");
            System.out.println("11:-Veg.Spring Roll....................................47/-");
            System.out.println("12:-Veg.Sizzler........................................90/-");
            System.out.println("13:-Veg.Grill Sizzler.................................100/-");
            System.out.println("14:-Cheese Sizzler....................................100/-");
            System.out.println("15:-Paneer Sizzler....................................110/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr5={52,52,52,52,52,52,55,52,52,52,47,90,100,100,110};
            System.out.println("How many plates do you want?");
            q=Integer.parseInt(in.readLine());
            price=arr5[b-1]*q;
            total=arr5[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Chinese_cuisine_dishes?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}                                               