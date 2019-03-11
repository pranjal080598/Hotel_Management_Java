import java.io.*;
import java.lang.*;
public class sid
{
    static int total=0;static int b;static int q;static int price;
    public void main3()throws IOException
    {
        bill mp=new bill();
        String []item1={"Steam Idli","Tomato Idli","Medu Wada","Idli and Wada","Rasam Vada","Dal Wada","Batata Wada","Sabudana Wada","Kutambir Wada","Plain Dosa","Masala Dosa","Cheese Dosa","Masala Cheese Dosa","Plain Rava Dosa","Masala rava Dosa","Masala Cheese Rava Dosa","Plain Mysore Dosa","Masala Mysore Dosa","Paper Sada","Paper Masala Dosa","Paper Cheese Dosa"};
        int r;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do  
        {
            System.out.println("SOUTH INDIAN DISHES                                       PRICE");
            System.out.println("1:-Steam Idli..............................................30/-");
            System.out.println("2:-Tomato Idli.............................................40/-");
            System.out.println("3:-Medu Wada...............................................35/-");
            System.out.println("4:-Idli and Wada...........................................35/-");
            System.out.println("5:-Rasam Vada..............................................45/-");
            System.out.println("6:-Dal Wada................................................30/-");
            System.out.println("7:-Batata Wada.............................................40/-");
            System.out.println("8:-Sabudana Wada...........................................50/-");
            System.out.println("9:-Kutambir Wada...........................................55/-");
            System.out.println("DOSAS                                                     PRICE");
            System.out.println("10:-Plain Dosa.............................................35/-");
            System.out.println("11:-Masala Dosa............................................45/-");
            System.out.println("12:-Cheese Dosa............................................65/-");
            System.out.println("13:-Masala Cheese Dosa.....................................75/-");
            System.out.println("14:-Plain Rava Dosa........................................45/-");
            System.out.println("15:-Masala Rava Dosa.......................................50/-");
            System.out.println("16:-Masala Cheese Rava Dosa................................80/-");
            System.out.println("17:-Plain Mysore Dosa......................................45/-");
            System.out.println("18:-Masala Mysore Dosa.....................................50/-");
            System.out.println("19:-Paper Sada.............................................80/-");
            System.out.println("20:-Masala Paper Dosa......................................85/-");
            System.out.println("21:-Cheese Paper Dosa.....................................105/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have."); 
            b=Integer.parseInt(in.readLine());
            int []arr3={30,40,35,35,45,30,40,50,55,35,45,65,75,45,50,80,45,50,80,85,105};
            System.out.println("Enter the quantity");
            int q=Integer.parseInt(in.readLine());
            total=arr3[b-1]*q;
            price=arr3[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do want anything else from South Indian Dishes?");
            System.out.println("if yes-1 or 0");
            r=Integer.parseInt(in.readLine());
        }
        while(r==1);
        mp.bil(total);
    }
}