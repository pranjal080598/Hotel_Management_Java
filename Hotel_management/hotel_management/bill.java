import java.io.*;
import java.lang.*;
public class bill
{
    static int serial=0;static String item2[]=new String[100];
    static int tot; static int qu[]=new int[100];
    static int price[]=new int[100];
    public void bil(int tott)
    {
          tot=tot+tott;
    }
    void main()
    { 
        main_menu jj=new main_menu();
        int x=jj.a;
        if(serial>0)
        {
            System.out.println("Your Bill is as follows");
            System.out.println("=====================================================");
            System.out.println("ITEM \t\t QUANTITY \t\t PRICE");
            System.out.println("=====================================================");
            for(int f=0;f<serial;f++)
            {
                System.out.println(""+item2[f]+" \t"+"\t+ "+qu[f]+" \t"+"\t "+price[f]+"");
            }
            fin_bill mm=new fin_bill();
            mm.fin(tot);
            System.out.println("");
            System.out.print("The total price to be paid is :");
            System.out.print(" \t "+tot);
            System.out.println("");
        }
    }
}