import java.io.*;
import java.lang.*;
public class Chinese_Rices
{
    static int total=0;static int b;static int q;static int price;
    public void main3()throws IOException
    {
        bill mp=new bill();String []item1={"Veg.Fried Rice","Veg.Szechwan Rice","Veg.Singapore Rice","Veg.Manchurian Rice","Veg.Garlic Rice","Veg.Ginger Rice","Veg.Hongkong Rice","Veg.Triple Rice","Veg.Combined Rice","Veg.Szechwan Combn.Rice","Steam Rice","Jeera Rice","Paneer Fried Rice","Paneer Szechwan Rice","Paneer Singapore Rice","Paneer Hongkong Rice","Paneer Ginger Rice","Paneer Manchurian Rice","Paneer Triple Rice"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("CHINESE RICES                                 PRICE");
            System.out.println("1:-Veg.Fried Rice...............................53/-");
            System.out.println("2:-Veg.Szechwan Rice............................58/-");
            System.out.println("3:-Veg.Singapore Rice...........................58/-");
            System.out.println("4:-Veg.Manchurian Rice..........................58/-");
            System.out.println("5:-Veg.Garlic Rice..............................58/-");
            System.out.println("6:-Veg.Ginger Rice..............................58/-");
            System.out.println("7:-Veg.Hongkong Rice............................58/-");
            System.out.println("8:-Veg.Triple Rice..............................63/-");
            System.out.println("9:-Veg.Combined Rice............................53/-");
            System.out.println("10:-Veg.Szechwan Combn.Rice.....................58/-");
            System.out.println("11:-Steam Rice..................................40/-");
            System.out.println("12:-Jeera Rice..................................55/-");
            System.out.println("13:-Paneer Fried Rice...........................58/-");
            System.out.println("14:-Paneer Szechwan Rice........................63/-");
            System.out.println("15:-Paneer Singapore Rice.......................63/-");
            System.out.println("16:-Paneer Hongkong Rice........................63/-");
            System.out.println("17:-Paneer Ginger Rice..........................63/-");
            System.out.println("18:-Paneer Manchurian Rice......................65/-");
            System.out.println("19:-Paneer Triple Rice..........................65/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr3={53,58,58,58,58,58,58,63,53,58,40,55,58,63,63,63,63,65,65};
            System.out.println("How many plates do you want?");
            q=Integer.parseInt(in.readLine());
            total=arr3[b-1]*q;
            price=arr3[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Chinese_Rices?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
 }