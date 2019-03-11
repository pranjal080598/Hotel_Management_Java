import java.io.*;
import java.lang.*;
public class soup
{
    static int total=0;
    public void main6()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int r;
        do
        {
            System.out.println("SOUPS TUREEN");
            System.out.println("1:-Regular Soups");
            System.out.println("2:-Chinese Soups");
            System.out.println("3:-Enter ur choice");
            int a=Integer.parseInt(in.readLine());
            switch(a)
            {
                case 1:
                {
                    Regular_Soups aa=new Regular_Soups();
                    aa.main1();
                    total=total+aa.total;
                    break;
                }
                case 2:
                {
                    Chinese_Soups aa=new Chinese_Soups();
                    aa.main2();
                    total=total+aa.total;
                    break;
                }
                default:
                {
                    System.out.println("False Input");
                }
             }
             System.out.println("Do you need anything else from soups?");
             System.out.println("If yes-1 or 0");
             r=Integer.parseInt(in.readLine());
         }
         while(r==1);
     }
}