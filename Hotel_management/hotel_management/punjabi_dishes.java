import java.io.*;
import java.lang.*;
public class punjabi_dishes
{
    static int total=0;static int b;static int q;static int price;
    public void main9()throws IOException
    {
        bill mp=new bill();
        int r=0;
        String []item1={"Saag Paneer Adraki","Paneer tikka masala","Veg.chilly mili","Veg.Hariyali","Veg.maharaja","Veg.jaipuri","Cottage Cheese Szechwan","Hong Kong vegetable","Veg.handi","Veg.kofta","Veg.kolhapuri","Veg.makhanwala","Veg.kashmiri","Veg.moghlai","Veg.Kurma","Mixed Veg","Malai Kofta","Navratan kurma","Methi mutter malai","Nargis Kofta","Paneer Kofta","Lasooni Mushroom Methi Malai","Paneer Kadai","Paneer Pasanda","Paneer handi","Navratnam korma","Paneer makhanwala","Paneer kurma","Paneer mutter","Makhai baby corn masala","Mushroom kadai","Mushroom pasanda","Mushroom handi","Mushroom baby corn masala","Mushroom Simla Mirch Hara Dhaniya","Tandoori Babycorn","Paneer masala","Shakahari Tarane-Platter of Assorted Bites"};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        do
        {
            System.out.println("PUNJABI DISHES                                      PRICE");
            System.out.println("1:-Saag Paneer Adraki................................105/-");   
            System.out.println("2:-Paneer tikka masala...............................150/-");
            System.out.println("3:-Veg.chilly mili...................................115/-");
            System.out.println("4:-Veg.hariyali......................................115/-");
            System.out.println("5:-Veg.maharaja......................................115/-");
            System.out.println("6:-Veg.jaipuri.......................................115/-");
            System.out.println("7:-Cottage Cheese Szechwan...........................105/-");
            System.out.println("8:-Hong Kong vegetable...............................105/-");                       
            System.out.println("9:-Veg.handi.........................................105/-");            
            System.out.println("10:-Veg.kofta........................................110/-");  
            System.out.println("11:-Veg.kolha puri...................................120/-");
            System.out.println("12:-Veg.makhanwala...................................120/-");
            System.out.println("13:-Veg.kashmiri.....................................120/-");
            System.out.println("14:-Veg.moghlai......................................120/-");
            System.out.println("15:-Veg.kurma........................................115/-");
            System.out.println("16:-Mixed veg........................................120/-");
            System.out.println("17:-Malai kofta......................................120/-");
            System.out.println("18:-Navratan kurma...................................110/-");     
            System.out.println("19:-Methi mutter malai...............................100/-");
            System.out.println("20:-Nargis kofta.....................................105/-");
            System.out.println("21:-Paneer kofta.....................................150/-");
            System.out.println("22:-Lasooni Mushroom Methi Malai.....................115/-");
            System.out.println("23:-Paneer kadai.....................................150/-");
            System.out.println("24:-Paneer pasanda...................................150/-");
            System.out.println("25:-Paneer handi.....................................150/-");
            System.out.println("26:-Navratnam Korma..................................150/-");
            System.out.println("27:-Paneer makhanwala................................155/-");
            System.out.println("28:-Paneer kurma.....................................150/-");
            System.out.println("29:-Paneer mutter....................................155/-");
            System.out.println("30:-Tawa Se Paneer Mutter Masaledar..................150/-");
            System.out.println("31:-Makhai baby corn masala..........................140/-");
            System.out.println("32:-Mushroom kadai...................................130/-");
            System.out.println("33:-Mushroom handi...................................130/-");
            System.out.println("34:-Mushroom baby corn masala........................135/-");
            System.out.println("35:-Mushroom Simla Mirch Hara Dhaniya................150/-");
            System.out.println("36:-Tandoori Babycorn................................135/-");
            System.out.println("37:-Paneer masala....................................130/-");
            System.out.println("38:-Shakahari Tarane-Platter of Assorted Bites.......320/-");
            System.out.println("What would you like to have?");
            System.out.println("Enter code of the dish you want to have.");
            b=Integer.parseInt(in.readLine());
            int []arr1={105,150,115,115,115,115,105,105,105,110,120,120,120,120,115,120,120,110,100,105,150,115,150,150,150,150,155,150,155,150,140,130,130,135,150,135,130,320};
            System.out.println("Enter the quantity.");
            int q=Integer.parseInt(in.readLine());
            total=arr1[b-1]*q;
            price=arr1[b-1]*q;     
            mp.item2[mp.serial]=item1[b-1];
            mp.qu[mp.serial]=q;
            mp.price[mp.serial]=price;
            mp.serial++;
            System.out.println("do you want anything else from punjabi_dishes");
            System.out.println("if yes-1 or 0");
            r=Integer.parseInt(in.readLine());
        }
        while(r==1);
        mp.bil(total);
    }
}
 