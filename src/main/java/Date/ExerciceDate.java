package Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ExerciceDate {
  public static void main(String[] args) throws ParseException {
    String myDate = "1986/04/16 00:00:00";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    Date myBirthday = sdf.parse(myDate);

    myDate = "2010/05/15 00:00:00";
    Date testDate = sdf.parse(myDate);

    if(myBirthday.compareTo(testDate) == -1){
      System.out.println("Meu aniversário é antes do dia 15 de maio de 2010.");
    } else if(myBirthday.compareTo(testDate) == 1){
      System.out.println("Meu aniversário é depois do dia 15 de maio de 2010.");
    } else {
      System.out.println("As datas são iguais");
    }
  }
}
