package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSimpleDateFormat {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat frm = new SimpleDateFormat("EEEE dd, MMMM, yy KK:mm:ss a");
    String strOut;

    strOut = frm.format(date);

    System.out.println(strOut);
  }
}
