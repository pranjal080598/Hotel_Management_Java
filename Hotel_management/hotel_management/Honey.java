import java.io.*;
import java.lang.*;
public class Honey
{
    static int billtot;int def;static int day;
    public void main3()throws IOException
    {
        int ch;
        int cchh;
        main_menu kk=new main_menu();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int bill=12500;
        System.out.println("");
        System.out.println("Of what size of room would you like?");
        System.out.println("We have the following rooms available");
        System.out.println("");
        do
        {
            System.out.println("Code\troom");
            System.out.println("1:-\tSingle room");
            System.out.println("2:-\tDouble room");
            System.out.println("3:-\tSingle room with AC");
            System.out.println("4:-\tDouble room with AC");
            System.out.println("Enter your choice");
            int ch1=Integer.parseInt(in.readLine());
            System.out.println("Fine");
            System.out.println("How many days would you like to stay?");
            day=Integer.parseInt(in.readLine());
            bill=bill*day;
            switch(ch1)
            {
                case 1:
                {
                    System.out.println("Which scene should face your room?");
                    System.out.println("We have......");
                    System.out.println("code\tscene");
                    System.out.println("1:-\tsea face");
                    System.out.println("2:-\tgarden face");
                    System.out.println("3:-\tMountain face");
                    System.out.println("Enter the code according to your choice");
                    ch=Integer.parseInt(in.readLine());
                    System.out.println("fantastic choice");
                    billtot=bill+0;
                    System.out.println("");
                    for(int you=1;you<=day;you++)
                    {
                        System.out.println("THIS IS YOUR "+you+" DAY IN THE HOTEL");
                        System.out.println("Will you lunch in the hotel?");
                        System.out.println("IF yes Enter 1 or 0");
                        int dine=Integer.parseInt(in.readLine());
                        if(dine==1)
                        {
                            System.out.println("^^^^^^Will you have your lunch in your room or will you come to the HALL dine?^^^^^");
                            System.out.println("code\toption");
                            System.out.println("1:-\troom");
                            System.out.println("2:-\thall");
                            System.out.println("Enter your choice");
                            cchh=Integer.parseInt(in.readLine());
                            System.out.println("OK");
                            System.out.println("");
                            System.out.println("Here is the Menu");
                            kk.main0();
                        }
                        else
                        {
                        }
                    }
                    break;
                 }
                 case 2:
                 {
                        System.out.println("Which scene should face your room?");
                        System.out.println("We have......");
                        System.out.println("code\tscene");
                        System.out.println("1:-\tsea face");
                        System.out.println("2:-\tgarden face");
                        System.out.println("3:-\tMountain face");
                        System.out.println("Enter the code according to your choice");
                        ch=Integer.parseInt(in.readLine());
                        System.out.println("fantastic choice");
                        billtot=bill+0;
                        System.out.println("");
                        for(int you=1;you<=day;you++)
                        {
                            System.out.println("THIS IS YOUR "+you+" DAY IN THE HOTEL");
                            System.out.println("Will you lunch in the hotel?");
                            System.out.println("IF yes Enter 1 or 0");
                            int dine=Integer.parseInt(in.readLine());
                            if(dine==1)
                            {
                                System.out.println("^^^^^^Will you have your lunch in your room or will you come to the HALL dine?^^^^^");
                                System.out.println("code\toption");
                                System.out.println("1:-\troom");
                                System.out.println("2:-\thall");
                                System.out.println("Enter your choice");
                                cchh=Integer.parseInt(in.readLine());
                                System.out.println("OK");
                                System.out.println("");
                                System.out.println("Here is the Menu");
                                kk.main0();
                            }
                            else
                            {
                            }
                        }
                        break;
                   }
                   case 3:
                   {
                               System.out.println("Which scene should face your room?");
                               System.out.println("We have......");
                               System.out.println("code\tscene");
                               System.out.println("1:-\tsea face");
                               System.out.println("2:-\tgarden face");
                               System.out.println("3:-\tMountain face");
                               System.out.println("Enter the code according to your choice");
                               ch=Integer.parseInt(in.readLine());
                               System.out.println("fantastic choice");
                               bill=bill+(5000*day);
                               billtot=bill+0;
                               System.out.println("");
                               for(int you=1;you<=day;you++)
                               {
                                    System.out.println("THIS IS YOUR "+you+" DAY IN THE HOTEL");
                                    System.out.println("Will you lunch in the hotel?");
                                    System.out.println("IF yes Enter 1 or 0");
                                    int dine=Integer.parseInt(in.readLine());
                                    if(dine==1)
                                    {
                                          System.out.println("^^^^^^Will you have your lunch in your room or will you come to the HALL dine?^^^^^");
                                          System.out.println("code\toption");
                                          System.out.println("1:-\troom");
                                          System.out.println("2:-\thall");
                                          System.out.println("Enter your choice");
                                          cchh=Integer.parseInt(in.readLine());
                                          System.out.println("OK");
                                          System.out.println("");
                                          System.out.println("Here is the Menu");
                                          kk.main0();
                                    }
                                    else
                                    {
                                    }
                                }
                                break;
                            }
                            case 4:
                            {
                                System.out.println("Which scene should face your room?");
                                System.out.println("We have......");
                                System.out.println("code\tscene");
                                System.out.println("1:-\tsea face");
                                System.out.println("2:-\tgarden face");
                                System.out.println("3:-\tMountain face");
                                System.out.println("Enter the code according to your choice");
                                ch=Integer.parseInt(in.readLine());
                                System.out.println("fantastic choice");
                                bill=bill+(5000*day);
                                billtot=bill+0;
                                System.out.println("");
                                for(int you=1;you<=day;you++)
                                {
                                    System.out.println("THIS IS YOUR "+you+" DAY IN THE HOTEL");
                                    System.out.println("Will you lunch in the hotel?");
                                    System.out.println("IF yes Enter 1 or 0");
                                    int dine=Integer.parseInt(in.readLine());
                                    if(dine==1)
                                    {
                                        System.out.println("^^^^^^Will you have your lunch in your room or will you come to the HALL dine?^^^^^");
                                        System.out.println("code\toption");
                                        System.out.println("1:-\troom");
                                        System.out.println("2:-\thall");
                                        System.out.println("Enter your choice");
                                        cchh=Integer.parseInt(in.readLine());
                                        System.out.println("OK");
                                        System.out.println("");
                                        System.out.println("Here is the Menu");
                                        kk.main0();
                                    }
                                    else
                                    {
                                    }
                               }
                               break;
                          }
                          default:
                          {
                                System.out.println("false input");
                          }
                          def=0;
                      }
                 }
              while(def==1);
             bill=bill+0;
       }
}