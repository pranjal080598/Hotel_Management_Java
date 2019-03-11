import java.io.*;
import java.lang.*;
public class main
{
    static String name1;static int price;static int ch;static  String name2;
    public static void main(String args[])throws IOException
    {
        date kj=new date();int r;
        kj.main();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("WELCOME TO THE HOTEL MUMBAI STAR");
        System.out.println("");
        System.out.println("Please have a cold drink");
        System.out.println("");
        System.out.println("Wat's your name ?");
        name2=in.readLine();
        System.out.println("Would you like to only dine?");
        System.out.println("Or would you like to stay?");
        System.out.println("If you would only dine press 1 or press 0");
        int f=Integer.parseInt(in.readLine());
        if(f==1)
        {
            main_menu ko=new main_menu();
            ko.main0();

        }
        else
        {   
            System.out.println("");
            System.out.println("In which room would you like to stay?");
            System.out.println("We have the followong rooms available");
            System.out.println("");
            do
            {
                System.out.println("code \troom\tprice");
                System.out.println("1:-\t Family room\t\t 8500/day");
                System.out.println("2:-\t couple room\t\t10000/day");
                System.out.println("3:-\tHoney-moon suit\t\t12500/day");
                System.out.println("Enter your choice according to the code");
                ch=Integer.parseInt(in.readLine());
    
                switch(ch)
                {
                    case 1:
                    {   
                        name1="FAMILY";price=8500;
                        family mm=new family();
                        mm.main1();
                        r=0;
                        int h=mm.billtot;
                        main_bill w=new main_bill();
                        w.main0(h);
                        break;
                    }
                    case 2:
                    {
                        name1="COUPLE";price=10000;
                        couple km=new couple();
                        km.main2();
                        r=0;
                        int h=km.billtot;
                        main_bill w=new main_bill();
                        w.main0(h);
                        break;
                    }
                    case 3:
                    {
                        name1="HONEY-MOON";price=12500;
                        Honey mo=new Honey();
                        mo.main3();
                        r=0;
                        int h=mo.billtot;
                        main_bill w=new main_bill();
                        w.main0(h);
                        break;
                    }
                    default:
                    {
                        System.out.println("False input");
                        r=1; 
                    }
               }
           }
           while(r==1);
           fin_bill we=new fin_bill();
           we.main();
      }
   }
}