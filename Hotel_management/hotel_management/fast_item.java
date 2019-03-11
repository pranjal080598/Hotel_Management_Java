import java.io.*;
import java.lang.*;
public class fast_item
{
    static int total=0;static int b;static int q;static int price;
    public void main2()throws IOException
    {
        bill mp=new bill();
        String []item1={"Sweet Kachori","Sabudana Wada","Sabudana Khichdi","Potato Chips","Potato Toast","Dahi Potato","Fruit Salad","Plain sandwich","Grilled sandwich","Cheesy Cheesy","Veggie Club","Very Veggie","Paneer Tikka","Bombay Toast","Corn Cheese Toast","Chilli Cheese Toast","Veg Mayo Toast","Veg Banana Crush","Cheesy Veggie Patty","Veggie Patty","Aloo Tikki Burger","Bombay Burger"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("Press  the code of any of the following which you want to have");
            System.out.println(" FAST ITEM..............................PRICE");
            System.out.println("1:-Sweet Kachori........................40");
            System.out.println("2:-Sabudana Wada........................40");
            System.out.println("3:-Sabudana Khichdi.....................40");
            System.out.println("4:-Potato Chips.........................40");
            System.out.println("5:-Potato Toast.........................40");
            System.out.println("6:-Dahi Potato..........................40");
            System.out.println("7:-Fruit Salad..........................50");
            System.out.println("SANDWICHES                           PRICE");
            System.out.println("8:-Plain sandwich.......................85");
            System.out.println("8:-Grilled sandwich.....................85");
            System.out.println("9:-Cheesy Cheesy........................85");
            System.out.println("10:-Veggie Club ........................70");
            System.out.println("11:-Very Veggie.........................85");
            System.out.println("12:-Paneer Tikka........................85");
            System.out.println("13:-Bombay Toast........................65");
            System.out.println("14:-Corn Cheese Toast...................85");
            System.out.println("15:-Chilli Cheese Toast.................85");
            System.out.println("16:-Veg Mayo Toast.....................100");
            System.out.println("17:-Veg Banana Crush...................100");
            System.out.println("Burgers                              PRICE");
            System.out.println("18:-Cheesy Veggie Patty.................95");
            System.out.println("19:-Veggie Patty........................80");
            System.out.println("20:-Aloo Tikki Burger...................70");
            System.out.println("21:-Bombay Burger.......................65");
            System.out.println("Enter your choice");
            int b=Integer.parseInt(in.readLine());
            int[] arr3={40,40,40,40,40,40,50,85,85,85,70,85,85,65,85,85,100,100,95,80,70,65};
            System.out.println("Enter the quantity");
            int q=Integer.parseInt(in.readLine());
            price=arr3[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            total=total+(arr3[b-1]*q);
            System.out.println("Do you need anything else from fast_item?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}   