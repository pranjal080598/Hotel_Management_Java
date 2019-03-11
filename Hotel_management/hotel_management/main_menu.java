import java.io.*;
import java.lang.*;
import java.util.*;
public class main_menu
{
    static int ftot=0;static int a;
    public void main0()throws IOException
    {   
        int q;int b;
        System.out.println("");
        System.out.println("We Welcome you to HOTEL MUMBAI STAR.");
        System.out.print("Here is our Menu"); date pm=new date();pm.main();
        do
        {
            System.out.println("********MAIN  MENU********");
            System.out.println("1:-^^^^^^^^^^Starter^^^^^^^^^^");
            System.out.println("2:-^^^^^^^^^^^Snacks^^^^^^^^^^");
            System.out.println("3:-^^^^South Indian dishes^^^^");
            System.out.println("4:-^^^^^^^^^^^^Rice^^^^^^^^^^^");
            System.out.println("5:-^^^^^^^^^^Chinese^^^^^^^^^^");
            System.out.println("6:-^^^^^^^^^^^Soups^^^^^^^^^^^");
            System.out.println("7:-^^^Beverages&Milkshakes^^^^");
            System.out.println("8:-^^^^^^^^Ice-creams^^^^^^^^^");
            System.out.println("9:-^^^^^^^^Punjabi Dishes^^^^^");
            System.out.println("10:-^^^^^^^Pav bhaji^^^^^^^^^^^");
            System.out.println("~~~~Enter your choice accordin 2 the assigned Sr.no~~~");
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            a=Integer.parseInt(in.readLine());

            if(a>11||a<1)
            {
                System.out.println("Flase input");
            }
            else
            {
                  switch (a)
                  {
                        case 1:
                        {
                            starter mm=new starter();
                            mm.main1();
                            break;
                        }
                        case 2:
                        {
                            snacks mm=new snacks();
                            mm.main2();
                            break;
                        }
                        case 3:
                        {
                            sid mm=new sid();
                            mm.main3();
                            break;
                        }
                        case 4:
                        {
                            rice mm=new rice();
                            mm.main4();
                            break;
                        }
                        case 5:
                        {
                            chinese mm=new chinese();
                            mm.main5();
                            break;
                        }
                        case 6:
                        {
                            soup mm=new soup();
                            mm.main6();
                            break;
                        }
                        case 7:
                        {
                            Beverages_Milkshakes mm=new Beverages_Milkshakes();
                            mm.main7();
                            break;
                        }
                        case 8:
                        {
                            icecreams mm=new icecreams();
                            mm.main8();
                            break;
                        }
                        case 9:
                        {
                            punjabi_dishes mm=new punjabi_dishes();
                            mm.main9();
                            break;
                        }
                        case 10:
                        {
                            PAV_BHAJI mm=new PAV_BHAJI();
                            mm.main();
                            break;
                        }
                        default:
                        {
                            System.out.println("Kindly enter the code of the type of food you would like to have food ");
                            break;
                        }
                  }
           }
      System.out.println("Do you want anything else from main menu?");
      System.out.println("if yes enter 1 or 0"); 
      q=Integer.parseInt(in.readLine());
      } 
      while(q==1);
      bill mp=new bill();
      mp.main();
   }
}