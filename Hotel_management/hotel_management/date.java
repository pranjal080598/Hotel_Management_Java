import java.io.*;
import java.lang.*;
import java.util.*;
public class date
{ 
    void main()
    {
         Calendar c=Calendar.getInstance();
         System.out.println("Date => "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
     }
}