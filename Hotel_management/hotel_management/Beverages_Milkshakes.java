import java.io.*;
import java.lang.*;
public class Beverages_Milkshakes
{
    static int total=0;static int b;static int q;static int price;
    public void main7()throws IOException
    {
        bill mp=new bill();
        String []item1={"Coffee","Tea","Black Tea","Cappuccino","Spl.Tea","Filtered Coffee","Nescafe","Chocolate","Mosambi","Orange","Pineapple","Ganga Jamuna","Grape Juice","Annar Juice","Tomato","Cocktail","Sikander Sarbat","Apple","Banana","Mango","Dry Fruit","Kaju Anjeer","Cold Coffee","Cold Coffee&Ice Cream","Rose","Rose&Ice Cream","Chocolate","Chocolate&Ice Cream","CAD M","CAD B","FerreroRocher CAD","Dairy Milk CAD","Mini CAD","Extra Chocolate","Crawfords Mango Fool","Koliwada Vibrant Youth","Linking Lady","Girl Friend In Hanging Garden","Five Gardens Kala Cola Gola","Breach Candy's - Pinacolada","Mumbai's Virgin Rita","Sunset At Bandstand","Santacruz Avenue","Juhu Natural","Nariman Bloom"};
        int r;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {
            System.out.println("HOT BEVERAGES                               PRICE");
            System.out.println("1:-Coffee.....................................50/-");
            System.out.println("2:-Tea........................................45/-");
            System.out.println("3:-Black Tea..................................52/-");
            System.out.println("4:-Cappuccinno................................68/-");
            System.out.println("5:-Spl.Tea....................................42/-");
            System.out.println("6:-Filtered Coffee............................50/-");
            System.out.println("7:-Nescafe....................................50/-");
            System.out.println("8:-Chocolate..................................64/-");
            System.out.println("JUICE ITEMS                                  PRICE");
            System.out.println("9:-Mosambi....................................45/-");
            System.out.println("10:-Orange....................................45/-");
            System.out.println("11:-Pineapple.................................45/-");
            System.out.println("12:-Ganga Jamuna..............................45/-");
            System.out.println("13:-Grape Juice...............................50/-");
            System.out.println("14:-Annar Juice...............................56/-");
            System.out.println("15:-Tomato....................................40/-");
            System.out.println("16:-Cocktail..................................65/-");
            System.out.println("17:-Sikander Sarbat...........................65/-");
            System.out.println("MILKSHAKES                                   PRICE");
            System.out.println("18:-Apple.....................................55/-");
            System.out.println("19:-Banana....................................43/-");
            System.out.println("20:-Mango.....................................68/-");
            System.out.println("21:-Dry Fruit.................................90/-");
            System.out.println("22:-Kaju Anjeer...............................90/-");
            System.out.println("23:-Cold Coffee...............................78/-");
            System.out.println("24:-Cold Coffee&Ice Cream.....................94/-");
            System.out.println("25:-Rose......................................55/-");
            System.out.println("26:-Rose&Ice Cream............................70/-");
            System.out.println("27:-Chocolate.................................70/-");
            System.out.println("28:-Chocolate&Ice Cream.......................87/-");
            System.out.println("CADS                                         PRICE");
            System.out.println("29.CAD M......................................90/-");
            System.out.println("30.CAD B......................................90/-");
            System.out.println("31.FerreroRocher CAD.........................120/-");
            System.out.println("32.Dairy Milk CAD............................110/-");
            System.out.println("33.Mini CAD...................................70/-");
            System.out.println("34.Extra Chocolate............................40/-");
            System.out.println("MUMBAI SPECIAL                               PRICE");
            System.out.println("35.Crawfords Mango Fool......................105/-");
            System.out.println("36.Koliwada Vibrant Youth....................105/-");
            System.out.println("37.Linking Lady..............................105/-");
            System.out.println("38.Girl Friend In Hanging Garden.............105/-");
            System.out.println("39.Five Gardens Kala Cola Gola...............105/-");
            System.out.println("40.Breach Candy's - Pinacolada...............105/-");
            System.out.println("41.Mumbai's Virgin Rita......................105/-");
            System.out.println("42.Sunset At Bandstand.......................105/-");
            System.out.println("43.Santacruz Avenue..........................110/-");
            System.out.println("44.Juhu Natural..............................110/-");
            System.out.println("45.Nariman Bloom.............................120/-");
            System.out.println("Enter the code of your choice food item");
            b=Integer.parseInt(in.readLine());
            System.out.println("Enter the quantity");
            int q=Integer.parseInt(in.readLine());
            int []arr7={50,45,52,68,42,50,50,64,45,45,45,45,50,56,40,65,65,55,43,68,90,90,78,94,55,70,70,87,90,90,120,110,70,40,105,105,105,105,105,105,105,105,105,110,110,120};
            total=total+arr7[b-1]*q;
            price=arr7[b-1]*q;     
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("Do you need anything else from Beverages_Milkshakes?");
            System.out.println("If yes-1 or 0");
            r=Integer.parseInt(in.readLine()); 
        }
        while(r==1);
        mp.bil(total);
     }
}
	