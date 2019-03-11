import java.io.*;
import java.lang.*;
public class dosas
{
    static int total=0;static int b;static int q;static int price;
    public void main3()throws IOException
    {
        bill mp=new bill();
        String []item1={"Plain Dosas","Palak sada dosa","Palak masala dosa","Set dosa","Baby dosa","Cheese sada dosa","Butter sada dosa","Cheese masala dosa","Schezwan palak dosa","Cheese palak masala","Ghee paper dosa","Ghee paper masala","Mysore masala","Rava masala","Onion rava dosa","Masala Dosa","Cheese Dosa","Masala Cheese Dosa","Plain Rava Dosa","Masala Rava Dosa","Masala Cheese Rava Dosa","Plain Mysore Dosa","Masala Mysore Dosa","Paper Sada","Masala Paper Dosa","Cheese Paper Dosa"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("DOSAS                        PRICE");
            System.out.println("1:-Plain Dosas.............................................36/-");
            System.out.println("2:-Palak sada dosa.........................................34/-");
            System.out.println("3:-Palak masala dosa.......................................37/-");
            System.out.println("4:-Set dosa................................................34/-");
            System.out.println("5:-Baby dosa...............................................34/-");
            System.out.println("6:-Cheese sada dosa........................................39/-");
            System.out.println("7:-Butter sada dosa........................................39/-");
            System.out.println("8:-Cheese masala dosa......................................39/-");
            System.out.println("9:-Schezwan palak dosa.....................................47/-");
            System.out.println("10:-Cheese palak masala....................................37/-");
            System.out.println("11:-Ghee paper dosa........................................47/-");
            System.out.println("12:-Ghee paper masala......................................52/-");
            System.out.println("13:-Mysore masala..........................................36/-");
            System.out.println("14:-Rava masala............................................37/-");
            System.out.println("15:-Onion rava dosa........................................35/-");
            System.out.println("16:-Masala Dosa............................................45/-");
            System.out.println("17:-Cheese Dosa............................................65/-");
            System.out.println("18:-Masala Cheese Dosa.....................................75/-");
            System.out.println("19:-Plain Rava Dosa........................................45/-");
            System.out.println("20:-Masala Rava Dosa.......................................50/-");
            System.out.println("21:-Masala Cheese Rava Dosa................................80/-");
            System.out.println("22:-Plain Mysore Dosa......................................45/-");
            System.out.println("23:-Masala Mysore Dosa.....................................50/-");
            System.out.println("24:-Paper Sada.............................................80/-");
            System.out.println("25:-Masala Paper Dosa......................................85/-");
            System.out.println("26:-Cheese Paper Dosa.....................................105/-");
            System.out.println("");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            b=Integer.parseInt(in.readLine());
            int []arrd={36,34,37,34,34,39,39,39,47,37,47,52,36,37,35,45,65,75,45,50,80,45,50,80,85,105};
            System.out.println("Enter the quantity");
            q=Integer.parseInt(in.readLine());
            price=arrd[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            total=total+(arrd[b-1]*q);
            System.out.println("Do you need anything else from dosas?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}
