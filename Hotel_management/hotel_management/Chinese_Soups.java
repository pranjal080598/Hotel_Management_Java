import java.io.* ;
import java.lang.*;
public class Chinese_Soups
{
    static int total=0;static int b;static int q;static int price;
    public void main2()throws IOException
    { 
        bill mp=new bill();String []item1={"Palak soup","Tomato soup with cream","veg soup with cream","french onion soup","Sweet Corn Plain Soup","SWEET CORN VEG.SOUP","SWEET CORN WITH MUSHROOM SOUP","MUSHROOM SOUP","MANCHOW SOUP","HOT AND SOUR SOUP","VEG.NOODLE SOUP","VEG.CLEAN SOUP"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        do
        {
            System.out.println("CHINESE SOUPS                       PRICE");
            System.out.println(" 1:-Palak soup.......................60/-");
            System.out.println(" 2:-Tomato soup with cream...........75/-");
            System.out.println(" 3:-veg soup with cream..............75/-");
            System.out.println(" 4:-french onion soup................60/-");
            System.out.println(" 5:-SWEET CORN PLAIN SOUP............60/-");
            System.out.println(" 6:-SWEET CORN VEG.SOUP..............60/-");
            System.out.println(" 7:-SWEET CORN WITH MUSHROOM SOUP....65/-");
            System.out.println(" 8:-MUSHROOM SOUP....................60/-");
            System.out.println(" 9:-MANCHOW SOUP.....................60/-");
            System.out.println("10:-HOT AND SOUR SOUP................60/-");
            System.out.println("11:-VEG.NOODLE SOUP..................60/-");
            System.out.println("12:-VEG.CLEAN SOUP...................60/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            int b=Integer.parseInt(in.readLine());
            int []arr1={60,75,75,60,60,60,65,60,60,60,60,60};
            System.out.println("Enter the quantity you want.");
            int q=Integer.parseInt(in.readLine());
            price=arr1[b-1]*q;
            total=arr1[b-1]*q;
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from chinese_soups" );
            System.out.println("If yes -1 or 0");
            i=Integer.parseInt(in.readLine());
        }
        while(i==1);
        mp.bil(total);
    }
}