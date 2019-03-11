import java.io.*;
import java.lang.*;
public class fin_bill
{
    static int total=0;
    public void fin(int tot)
    {
        total=total+tot;
    }
    static int sd;
    void main()
    {
        main mm=new main();
        String name2=mm.name2;
        switch(mm.ch)
        {
            case 1:
            {
                family m=new family();
                sd=m.day;
                break;
            }
            case 2:
            {
                couple m=new couple();
                sd=m.day;
                break;
            }
            case 3:
            {
                Honey m=new Honey();
                sd=m.day;
                break;
            }
       }
       String name=mm.name1;
       System.out.println("");
       System.out.println("ROOM SELECTED \t\t PRICE ");
       System.out.println(name+" ROOM\t\t"+mm.price+"/day");
       System.out.println("NUMBER OF DAYS STAYED="+sd);
       System.out.println("");
       System.out.println("*************YOUR TOTAL BILL IS **********                ^^^^"+total+"^^^^");
       System.out.println("");
       System.out.println("");
       System.out.println("  $$$$$$$$$$$$$$       VISIT AGAIN  "+name2+"    $$$$$$$$$$$$$$$");
    }
}