import java.io.*;
import java.lang.*;
public class PAV_BHAJI
{
    static int total=0;static int b;static int q;static int price;
    public void main()throws IOException
    {
        bill mp=new bill();  
        String []item1={"Pav Bhaji","Spl.Pav Bhaji","Jain Pav Bhaji","Khada Pav Bhaji","Tomato Pav Bhaji","Cheese Pav Bhaji","Jain Cheese Pav Bhaji","Only Bhaji","Masala Pav(2pcs)","Cheese Masala Pav","Butter Pav(single)","Onion fry","Simla-Tomato fry"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("PAV BHAJI                                PRICE");
            System.out.println("1:-Pav Bhaji..............................60/-");
            System.out.println("2:-Spl.Pav Bhaji..........................85/-");
            System.out.println("3:-Jain Pav Bhaji.........................75/-");
            System.out.println("4:-Khada pav bhaji........................60/-");
            System.out.println("5:-Tomato pav bhaji.......................65/-");
            System.out.println("6:-Cheese pav bhaji.......................75/-");
            System.out.println("7:-Jain cheese pav bhaji..................80/-");
            System.out.println("8:-Only bhaji.............................50/-");
            System.out.println("9:-Masala pav(2pcs).......................35/-");
            System.out.println("10:-Cheese masala pav.....................50/-");
            System.out.println("11:-Butter pav(single)....................15/-");
            System.out.println("12:-Onion fry.............................25/-");
            System.out.println("13:-Simla-tomato fry......................40/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have."); 
            b=Integer.parseInt(in.readLine());
            int []arr1={60,85,75,60,65,75,80,50,35,50,15,25,40};
            System.out.println("Enter the quantity");
            q=Integer.parseInt(in.readLine());
            price=arr1[b-1]*q;     
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Pav_Bhaji" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}