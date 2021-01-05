import java.util.*;
import java.text.*;

public class datedemo {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
      SimpleDateFormat gt = 
    	      new SimpleDateFormat ("G yyyy.MM.dd 'at' hh:mm:ss a zzz");
      SimpleDateFormat t = 
    	      new SimpleDateFormat ("W yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
      System.out.println( gt.format(dNow));
      System.out.println( t.format(dNow));
          
      
   }
   
}