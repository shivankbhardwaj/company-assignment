import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      
      Date date = new Date();

      String str = String.format("Current Date/Time : %tc", date );

      System.out.println(str);
   }
}
