package Date;

import java.text.DateFormat;
import java.util.Date;

public class MainDateFormat {
  public static void main(String[] args) {
    Date date = new Date();
    String dateToStr;
//    dateToStr = DateFormat.getInstance().format(date);
    dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(date);

    System.out.println(dateToStr);




  }
}
