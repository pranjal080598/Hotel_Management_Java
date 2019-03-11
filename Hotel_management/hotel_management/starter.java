import java.io.*;
import java.lang.*;
public class starter
{  
    static int total=0;static int b;static int q;static int price;
    public void main1()throws IOException
    { 
        bill mp=new bill();
        String []item1={"Bhel","Veg. Chinese Bhel","Veg.Spring Rolls","Veg.Lollypops","Veg.Crispy","Veg.Paneer Spring Rolls","Veg.Paneer Crispy","Chole Bhatura","Chole Masala Bhatura","Extra Bhatura","Extra Masala Bhatura","Scezwan Fingers","Alu Chat","Hara Bhara Kabab","Paneer Tikka Dry","Idli Chilly Dry","Crispy Veg Chilly","Veg Papad Roll","Hariyali Kabab","Palak Chilly Dry"};
        int c=0;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        { 
            System.out.println("STARTER MENU'S ITEMS                                                PRICE  ");
            System.out.println("1:-Bhel...............................................................53/-");
            System.out.println("2:-Veg. Chinese Bhel..................................................63/-");
            System.out.println("3:-Veg.Spring Rolls...................................................65/-");
            System.out.println("4:-Veg.Lollypops......................................................60/-");
            System.out.println("5:-Veg.Crispy.........................................................60/-");
            System.out.println("6:-Veg.Paneer Spring Rolls............................................65/-");
            System.out.println("7:-Veg.Paneer Crispy..................................................65/-");
            System.out.println("8:-Chole Bhatura......................................................35/-");
            System.out.println("9:-Chole Masala Bhatura...............................................40/-");
            System.out.println("10:-Extra Bhatura.....................................................10/-");
            System.out.println("11:-Extra Masala Bhatura..............................................12/-");
            System.out.println("12:-Scezwan Fingers...................................................57/-");
            System.out.println("13:-Alu Chat..........................................................32/-");
            System.out.println("14:-Hara Bhara Kabab..................................................57/-");
            System.out.println("15:-Paneer Tikka Dry..................................................67/-");
            System.out.println("16:-Idli Chilly Dry...................................................47/-");
            System.out.println("17:-Crispy Veg Chilly.................................................62/-");
            System.out.println("18:-Veg Papad Roll....................................................57/-");
            System.out.println("19:-Hariyali Kabab....................................................57/-");
            System.out.println("20:-Palak Chilly Dry..................................................52/-");
            System.out.println("What would you like to have?");    
            System.out.println("Enter code of the dish you want to have."); 
            b=Integer.parseInt(in.readLine());
            if(b<=20)
            {
                System.out.println("Enter the quantity");
                q=Integer.parseInt(in.readLine());
                int []arr1={53,53,65,60,60,65,65,35,40,10,12,57,32,57,67,47,62,57,57,52};
                total=total+(arr1[b-1]*q);
                price=arr1[b-1]*q;     
                mp.item2[mp.serial]=item1[b-1];
                mp.qu[mp.serial]=q;
                mp.price[mp.serial]=price;
                mp.serial++;
                System.out.println("do you want anything else from starter?");
                System.out.println("if yes-1 or 0");
                c=Integer.parseInt(in.readLine());
            }
    }
    while(c==1);
    mp.bil(total);
    }
}