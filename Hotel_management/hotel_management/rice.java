import java.io.*;
import java.lang.*;
public class rice
{
    static int total=0;static int q;static int price;static int b;
    public void main4()throws IOException
    {
        bill mp=new bill();
        String []item1={"Veg.Fried Rice","Veg.Singapore Rice","Veg.Szechwan Rice","Veg.Singapore Rice","Veg.Manchurian Rice","Veg.Garlic Rice","Veg.Ginger Rice","Veg.Hongkong Rice","Veg.Triple Rice","Veg.Szechwan Rice","Veg.Szechwan Comb Rice","Steam Rice","Paneer Fried Rice","Paneer Hongkong Rice","Paneer Singapore Rice"}; 
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int r;
        do
        {
            System.out.println("RICE  VARIETIES                                                     PRICE");
            System.out.println("1:-Veg.Fried Rice.....................................................50/-");
            System.out.println("2:-Veg.Singapore Rice.................................................55/-");
            System.out.println("3:-Veg.Szechwan Rice..................................................60/-");
            System.out.println("4:-Veg.Singapore Rice.................................................78/-");
            System.out.println("5:-Veg.Manchurian Rice................................................87/-");
            System.out.println("6:-Veg.Garlic Rice....................................................75/-");
            System.out.println("7:-Veg.Ginger Rice....................................................65/-");
            System.out.println("8:-Veg.Hongkong Rice..................................................70/-");
            System.out.println("9:-Veg.Triple Rice....................................................45/-");
            System.out.println("10:-Veg.Combine Rice..................................................50/-");
            System.out.println("11:-Veg.Szechwan Comb Rice............................................67/-");
            System.out.println("12:-Steam Rice........................................................76/-");
            System.out.println("14:-Paneer Hongkong Rice..............................................78/-");
            System.out.println("15:-Paneer Singapore Rice.............................................85/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have."); 
            int b=Integer.parseInt(in.readLine());
            System.out.println("Enter the quantity");
            int q=Integer.parseInt(in.readLine());
            int []arr4={50,55,60,78,87,75,65,70,45,50,67,76,85,78,85};
            price=arr4[b-1]*q;
            total=total+arr4[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do want anything else from rice?");
            System.out.println("if yes-1 or 0");
            r=Integer.parseInt(in.readLine());
       }
       while(r==1);
       mp.bil(total);
   }
}