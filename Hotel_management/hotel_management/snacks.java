import java.io.*;
import java.lang.*;
public class snacks
{ 
    static int total=0;static int a;
    public void main2()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int r;
        do
        {
            System.out.println("snacks ");
            System.out.println("1:-Chaat");
            System.out.println("2:-fast item");
            System.out.println("3:-dosas");
            System.out.println("Enter your choice"); 
            a=Integer.parseInt(in.readLine());
            switch(a)
            {
                case 1:
                {
                    snack_sub kk=new snack_sub();
                    kk.main();
                    total=total+kk.total;
                    break;
                }
                case 2:
                {
                    fast_item kk=new fast_item();
                    kk.main2();
                    total=total+kk.total;
                    break;
                }
                case 3:
                {
                    dosas jj=new dosas();
                    jj.main3();
                    total=total+jj.total;
                    break;
                }
                default:
                {
                    System.out.println("FalseInput");
                }
           }
           System.out.println("Do want anything else from snacks?");
           System.out.println("if yes-1 or 0");
           r=Integer.parseInt(in.readLine());
      }
      while(r==1);
    }
}	