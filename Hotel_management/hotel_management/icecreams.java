import java.io.*;
import java.lang.*;
public class icecreams
{
    static int total=0;static int b;static int q;static int price;
    public void main8()throws IOException
    {
        bill mp=new bill();
        String []item1={"Chocolate","Chocolate Almond","Strawberry","Cherry","Bavarian Chocolate","World Class Chocolate","Fig","Chocolate Chip Mousse","Very Berry Strawberry","Chocolate Almond Praline","Sizzling Brownie A la Mode","Praline Cashew","Oreo Cookie Sundae","Banana Royale","Coffee Almond Fudge"};
        int r;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {
            System.out.println("ICE CREAMS                                           PRICE");
            System.out.println("1:-Chocolate...........................................65/-");
            System.out.println("2:-Chocolate almond....................................68/-");
            System.out.println("3:-Strawberry..........................................65/-");
            System.out.println("4:-Cherry..............................................65/-");
            System.out.println("5:-Bavarian Chocolate..................................74/-");
            System.out.println("6:-World Class Chocolate...............................74/-");
            System.out.println("7:-Fig.................................................70/-");
            System.out.println("8:-Chocolate Chip Mousse...............................74/-");
            System.out.println("9:-Very Berry Strawberry...............................74/-");
            System.out.println("10:-Chocolate Almond Praline...........................74/-");
            System.out.println("11:-Sizzling Brownie A la Mode........................140/-");
            System.out.println("12:-Praline Cashew.....................................87/-");
            System.out.println("13:-Oreo Cookie Sundae................................110/-");
            System.out.println("14:-Banana Royale......................................80/-");              
            System.out.println("15:-Coffee Almond Fudge...............................100/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            b=Integer.parseInt(in.readLine());
            System.out.println("Enter the quantity");
            int q=Integer.parseInt(in.readLine());
            int []arr8={65,68,65,65,74,74,70,74,74,74,140,87,110,80,100};
            total=total+(arr8[b-1]*q);
            price=arr8[b-1]*q;     
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from icecreams?");
            System.out.println("If yes-1 or 0");
            r=Integer.parseInt(in.readLine());
       }
       while(r==1);
       mp.bil(total);
     }
}