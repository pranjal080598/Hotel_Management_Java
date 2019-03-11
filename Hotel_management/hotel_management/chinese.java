import java.io.*;
import java.lang.*;
public class chinese
{
    static int total=0;
    public  void main5() throws IOException
    {
        int r; 
        do   
        {    
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            System.out.println("CHINESE");
            System.out.println("1:-Chinese_Starters");
            System.out.println("2:-Noodles");
            System.out.println("3:-Chinese Rices");
            System.out.println("4:-Manchurians");
            System.out.println("5:-Chinese Cuisine Dishes");
            System.out.println("Enter ur choice");
            int a=Integer.parseInt(in.readLine());
            switch(a)
            {
                case 1:
                {
                    Chinese_Starter aa=new Chinese_Starter();
                    aa.main();
                    total=total+aa.total;
                    break;
                }
                case 2:
                {
                    Noodles aa=new Noodles();
                    aa.main2();
                    total=total+aa.total;
                    break;
                }
                case 3:
                {
                    Chinese_Rices aa=new Chinese_Rices();
                    aa.main3();
                    total=total+aa.total;
                    break;
                }
                case 4:
                {
                    Manchurians aa=new Manchurians();
                    aa.main4();
                    total=total+aa.total;
                    break;
                }
                case 5:
                {
                    Chinese_cuisine_dishes aa=new Chinese_cuisine_dishes();
                    aa.main5();
                    total=total+aa.total;
                    break;
                }
                default:
                {
                    System.out.println("False Input");
                }
            }
            System.out.println("Do you need anything else from chinese?");
            System.out.println("If yes-1 or 0");
            r=Integer.parseInt(in.readLine());
       }
       while(r==1);
       total=total+0;
    }
}	