import java.io.*;
import java.lang.*;
public class Noodles
{
    static int total=0;static int b;static int q;static int price;
    public void main2()throws IOException
    {
        String []item1={"Veg.Hakka Noodles","Veg.Schezwan Noodles","Veg.Hongkong Noodles","Veg Singapore Noodles","Veg.Chowmien","Veg.American Choupsey","Veg.Chinese Choupsey","Veg.Manchurian","Veg.Chilly Garlic Noodles","Paneer Hakka Noodles","Paneer Schezwan Noodles","Paneer Manchurian Noodles","Paneer Singapore Noodles","Paneer Chowmien"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        bill mp=new bill();
        int i;
        do
        {
            System.out.println("NOODLES                                     PRICE");
            System.out.println("1:-Veg.Hakka Noodles..........................85/-");
            System.out.println("2:-Veg.Schezwan Noodles......................105/-");
            System.out.println("3:-Veg.Hongkong Noodles.......................68/-");
            System.out.println("4:-Veg Singapore Noodles......................68/-");
            System.out.println("5:-Veg.Chowmien...............................68/-");
            System.out.println("6:-Veg.American Choupsey......................68/-");
            System.out.println("7:-Veg.Chinese Choupsey.......................68/-");
            System.out.println("8:-Veg.Manchurian.............................68/-");
            System.out.println("9:-Veg.Chilly Garlic Noodles..................68/-");
            System.out.println("10:-Paneer Hakka Noodles......................68/-");
            System.out.println("11:-Paneer Schezwan Noodles...................63/-");
            System.out.println("12:-Paneer Manchurian Noodles.................63/-");
            System.out.println("13:-Paneer Singapore Noodles..................63/-");
            System.out.println("14:-Paneer Chowmien...........................60/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr2={85,105,68,68,68,68,68,68,68,68,63,63,63,60};
            System.out.println("How many plates do you want?");
            int q=Integer.parseInt(in.readLine());
            price=arr2[b-1]*q;
            total=arr2[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Noodles?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}