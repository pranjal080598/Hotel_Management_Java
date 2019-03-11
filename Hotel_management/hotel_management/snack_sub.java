import java.io.*;
import java.lang.*;
public class snack_sub
{  
    static int total=0;static int q;static String item;static int price;
    public void main()throws IOException
    {
        bill mp=new bill();
        String []item1={"Upma","Sheera","Idli Sambhar&Chatni","Wada Sambhar","Idli Fry","Idli Butter","Batata Wada","Punjabi Samosa","Veg.Cutlet","Mix Pakoda","Cheese/Paneer Pakoda","Methi Pakoda","Dahi Missal","Paneer Missal","Tava Idli"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("CHAAT                                                PRICE");
            System.out.println(""); 
            System.out.println("1:-Upma................................................35");
            System.out.println("2:-Sheera..............................................35");
            System.out.println("3:-Idli Sambhar&chatni.................................35");
            System.out.println("4:-Wada Sambhar........................................40");
            System.out.println("5:-Idli Fry............................................42");
            System.out.println("6:-Idli Butter.........................................45");
            System.out.println("7:-Potato Wada.........................................30");
            System.out.println("8:-Punjabi Samosa......................................35");
            System.out.println("9:-Veg.Cutlet..........................................35");
            System.out.println("10:-Mix pakoda.........................................40");
            System.out.println("11:-Cheese/Paneer Pakoda...............................45");
            System.out.println("12:-Methi Pakoda.......................................40");
            System.out.println("13:-Dahi Missal........................................40");
            System.out.println("14:-Paneer Missal......................................40");
            System.out.println("15:-Tava Idli..........................................60");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int[] arr0={35,35,35,40,42,45,30,35,35,40,45,40,40,40,60};
            System.out.println("Enter the quantity");
            q=Integer.parseInt(in.readLine());
            price=arr0[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            total=total+(arr0[b-1]*q);
            item=item1[b-1];
            System.out.println("Do you need anything else from snack_sub?" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
     }
}