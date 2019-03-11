import java .io.*;
import java.lang.*;
public class Manchurians
{
    static int total=0;static int b;static int q;static int price;
    public void main4()throws IOException
    {
        bill mp=new bill();String []item1={"Veg.Manchurian","Veg.Chilly","Veg.Szechwan","Veg.Garlic","Veg.Ginger","Veg.Sweet & Sour","Veg.Singapore","Veg.Hongkong","Veg.Sixty Five","Veg.Ball in Szechwan","Veg.Cauliflower Manchurian","Veg.CauliFlower Szech.Sauce","Veg.Chilly Potatoes","Veg.Potato Manchurian","Veg.Potato Szech.Sauce","Veg.Plain Gravy","Mushroom Manchurian","Flower Manchurian"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("MANCHURIANS                                   PRICE");
            System.out.println("1:-Veg.Manchurian...............................43/-");
            System.out.println("2:-Veg.Chilly...................................48/-");
            System.out.println("3:-Veg.Szechwan.................................48/-");
            System.out.println("4:-Veg.Garlic...................................48/-");
            System.out.println("5:-Veg.Ginger...................................48/-");
            System.out.println("6:-Veg.Sweet & Sour.............................48/-");
            System.out.println("7:-Veg.Singapore................................48/-");
            System.out.println("8:-Veg.Hongkong.................................48/-");
            System.out.println("9:-Veg.Sixty Five...............................48/-");
            System.out.println("10:-Veg.Ball in Szechwan........................48/-");
            System.out.println("11:-Veg.Cauliflower Manchurian..................48/-");
            System.out.println("12:-Veg.CauliFlower Szech.Sauce.................48/-");
            System.out.println("13:-Veg.Chilly Potatoes.........................48/-");
            System.out.println("14:-Veg.Potato Manchurian.......................48/-");
            System.out.println("15:-Veg.Potato Szech.Sauce......................48/-");
            System.out.println("16:-Veg.Plain Gravy.............................40/-");
            System.out.println("17:-Mushroom Manchurian.........................62/-");
            System.out.println("18:-Flower Manchurian...........................62/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr4={43,48,48,48,48,48,48,48,48,48,48,48,48,48,48,40,62,62};
            System.out.println("How many plates do you want?");
            q=Integer.parseInt(in.readLine());
            price=arr4[b-1]*q;
            total=arr4[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Manchurians?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}